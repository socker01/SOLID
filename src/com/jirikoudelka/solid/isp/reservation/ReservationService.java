package com.jirikoudelka.solid.isp.reservation;

import com.jirikoudelka.solid.ocp.Publication;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Interface for the reservations
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
public interface ReservationService {

	void makeReservation(Publication publication);
}
