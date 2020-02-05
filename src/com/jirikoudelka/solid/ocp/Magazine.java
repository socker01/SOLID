package com.jirikoudelka.solid.ocp;

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
public final class Magazine implements Publication{

	private final String name;
	private final Period period;
	private final Date printed;

	public Magazine(String name, Period period, Date printed) {
		this.name = Objects.requireNonNull(name);
		this.period = Objects.requireNonNull(period);
		this.printed = Objects.requireNonNull(printed);
	}

	@Override
	public boolean isReadyForReplacement() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(printed);
		calendar.add(Calendar.DAY_OF_WEEK, 7);

		if (calendar.getTime().after(new Date()) && period == Period.WEEKLY) {
			return true;
		}

		calendar = Calendar.getInstance();
		calendar.setTime(printed);
		calendar.add(Calendar.MONTH, 1);

		if (calendar.getTime().after(new Date()) && period == Period.MONTHLY) {
			return true;
		}

		calendar = Calendar.getInstance();
		calendar.setTime(printed);
		calendar.add(Calendar.MONTH, 3);

		if (calendar.getTime().after(new Date()) && period == Period.QUARTERLY) {
			return true;
		}

		return false;
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
