package com.jirikoudelka.solid.srp;

import com.jirikoudelka.shared.Author;
import com.jirikoudelka.shared.BookState;
import com.jirikoudelka.solid.ocp.Publication;

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
public final class Book implements Publication {

	private final String title;
	private final Author author;
	private final String genre;
	private final Date dateOfPublication;
	private BookState bookState;

	Book(String title, Author author, String genre, Date dateOfPublication, BookState bookState) {
		this.title = Objects.requireNonNull(title);
		this.author = Objects.requireNonNull(author);
		this.genre = Objects.requireNonNull(genre);
		this.dateOfPublication = Objects.requireNonNull(dateOfPublication);
		this.bookState = Objects.requireNonNull(bookState);
	}

	@Override
	public boolean isReadyForReplacement() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateOfPublication);
		calendar.add(Calendar.YEAR, 5);

		return calendar.getTime().after(new Date()) && bookState == BookState.DAMAGED;
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
