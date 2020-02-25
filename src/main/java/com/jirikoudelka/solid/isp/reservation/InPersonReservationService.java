package com.jirikoudelka.solid.isp.reservation;

import com.jirikoudelka.solid.ocp.Publication;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Implementation for the in person clients reservations
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
final class InPersonReservationService implements ReservationService {
	@Override
	public void makeReservation(Publication publication) {
		// logic for in person reservation

	}
}
