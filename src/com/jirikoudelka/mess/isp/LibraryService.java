package com.jirikoudelka.mess.isp;

import com.jirikoudelka.mess.srp.Book;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Interface for interaction with the library
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
public interface LibraryService {
	void makeOnlineBookReservation(Book book);

	void makeTelephoneBookReservation(Book book);

	void makeInPersonBookReservation(Book book);

	void payFineOnline(Book book);

	void payFineInPerson(Book book);

	//Same methods for the other types of publication (Magazine etc)
}
