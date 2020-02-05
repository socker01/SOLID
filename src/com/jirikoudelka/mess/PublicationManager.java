package com.jirikoudelka.mess;

import com.jirikoudelka.mess.ocp.Magazine;
import com.jirikoudelka.mess.srp.Book;
import com.jirikoudelka.shared.ReplacementMethod;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

/**
 * Represents the publication manager
 *
 * @author Jiri Koudelka
 * @since 05.02.2020
 */
@ParametersAreNonnullByDefault
public final class PublicationManager {

	private final ReplacementMethod replacementMethod;

	public PublicationManager(ReplacementMethod replacementMethod) {
		this.replacementMethod = Objects.requireNonNull(replacementMethod);
	}

	public void replaceBook(Book book) {
		switch (replacementMethod) {
			case REMOVE_FROM_BOOKSHELF:
				System.out.println("Book has been removed.");
				break;
			case REPAIR:
				System.out.println("Book has been repaired.");
				break;
			default:
				System.out.println("Unknown method of the replacement.");
		}
	}

	public void replaceMagazine(Magazine magazine) {
		switch (replacementMethod) {
			case REMOVE_FROM_BOOKSHELF:
				System.out.println("Magazine has been removed.");
				break;
			case REPAIR:
				System.out.println("Magazine has been repaired.");
				break;
			default:
				System.out.println("Magazine method of the replacement.");
		}
	}
}
