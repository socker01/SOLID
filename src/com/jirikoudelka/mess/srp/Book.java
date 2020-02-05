package com.jirikoudelka.mess.srp;

import com.jirikoudelka.mess.PublicationManager;
import com.jirikoudelka.shared.Author;
import com.jirikoudelka.shared.BookState;

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
public final class Book {

	private final String title;
	private final Author author;
	private final String genre;
	private final Date dateOfPublication;
	private BookState bookState;
	private final PublicationManager bookManager;

	Book(String title, Author author, String genre, Date dateOfPublication, BookState bookState, PublicationManager bookManager) {
		this.title = Objects.requireNonNull(title);
		this.author = Objects.requireNonNull(author);
		this.genre = Objects.requireNonNull(genre);
		this.dateOfPublication = Objects.requireNonNull(dateOfPublication);
		this.bookState = Objects.requireNonNull(bookState);
		this.bookManager = Objects.requireNonNull(bookManager);
	}

	private boolean isBookReadyForReplacement() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateOfPublication);
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

	public Date getDateOfPublication() {
		return dateOfPublication;
	}

	public BookState getBookState() {
		return bookState;
	}
}
