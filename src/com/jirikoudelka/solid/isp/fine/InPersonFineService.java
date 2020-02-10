package com.jirikoudelka.solid.isp.fine;

import com.jirikoudelka.solid.ocp.Publication;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Implementation for the online fine payments
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
final class InPersonFineService implements FineService {
	@Override
	public void payFine(Publication publication) {
		// logic for paying in person
	}
}
