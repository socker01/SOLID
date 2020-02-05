package com.jirikoudelka.mess;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

/**
 * Represents the book manager
 *
 * @author Jiri Koudelka
 * @since 05.02.2020
 */
@ParametersAreNonnullByDefault
final class BookManager {

	private final ReplacementMethod replacementMethod;

	public BookManager(ReplacementMethod replacementMethod) {
		this.replacementMethod = Objects.requireNonNull(replacementMethod);
	}

	void replaceBook(Book book) {
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
}
