package com.jirikoudelka.mess.isp;

import com.jirikoudelka.mess.srp.Book;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Implementation for the online clients
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
final class OnlineClientLibraryService implements LibraryService {

	@Override
	public void makeOnlineBookReservation(Book book) {
		// logic for the online reservation
	}

	@Override
	public void makeTelephoneBookReservation(Book book) {
		throw new UnsupportedOperationException("Online client is not supposed to make phone reservation");
	}

	@Override
	public void makeInPersonBookReservation(Book book) {
		throw new UnsupportedOperationException("Online client is not supposed to make phone reservation");
	}

	@Override
	public void payFineOnline(Book book) {
		// logic for the online payment
	}

	@Override
	public void payFineInPerson(Book book) {
		throw new UnsupportedOperationException("Online client is not supposed to pay fine in person");
	}
}
