package com.jirikoudelka.mess.ocp;

import com.jirikoudelka.mess.PublicationManager;
import com.jirikoudelka.shared.Period;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * Represents one magazine in the library.
 *
 * @author Jiri Koudelka
 * @since 05.02.2020
 */
@ParametersAreNonnullByDefault
public final class Magazine {
	private final String name;
	private final Period period;
	private final Date printed;
	private final PublicationManager publicationManager;

	Magazine(String name, Period period, Date publication, PublicationManager publicationManager) {
		this.name = Objects.requireNonNull(name);
		this.period = Objects.requireNonNull(period);
		this.printed = Objects.requireNonNull(publication);
		this.publicationManager = Objects.requireNonNull(publicationManager);
	}

	private boolean isMagazineReadyForReplacement() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(printed);
		calendar.add(Calendar.DAY_OF_WEEK, 7);

		if (calendar.getTime().after(new Date()) && period == Period.WEEKLY) {
			return true;
		}

		return false;
	}

	void inspectMagazine() {
		if (isMagazineReadyForReplacement()) {
			publicationManager.replaceMagazine(this);
		}
	}

	public String getName() {
		return name;
	}

	public Period getPeriod() {
		return period;
	}

	public Date getPrinted() {
		return printed;
	}
}
