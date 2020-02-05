package com.jirikoudelka.mess;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 * Represents one book in the library.
 *
 * @author Jiri Koudelka
 * @since 05.02.2020
 */
@ParametersAreNonnullByDefault
final class Book {

	private final String title;
	private final Author author;
	private final String genre;
	private final Date publication;
	private BookState bookState;
	private final BookManager bookManager;

	Book(String title, Author author, String genre, Date publication, BookState bookState, BookManager bookManager) {
		this.title = Objects.requireNonNull(title);
		this.author = Objects.requireNonNull(author);
		this.genre = Objects.requireNonNull(genre);
		this.publication = Objects.requireNonNull(publication);
		this.bookState = Objects.requireNonNull(bookState);
		this.bookManager = Objects.requireNonNull(bookManager);
	}

	private boolean isBookReadyForReplacement() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(publication);
		calendar.add(Calendar.YEAR, 5);

		if (calendar.getTime().after(new Date()) && bookState == BookState.DAMAGED) {
			return true;
		}

		return false;
	}

	void inspectBook() {
		if (isBookReadyForReplacement()) {
			bookManager.replaceBook(this);
		}
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public Date getPublication() {
		return publication;
	}

	public BookState getBookState() {
		return bookState;
	}
}
