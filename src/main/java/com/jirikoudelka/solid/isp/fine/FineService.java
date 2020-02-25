package com.jirikoudelka.solid.isp.fine;

import com.jirikoudelka.solid.ocp.Publication;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Interface for the fines
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
public interface FineService {
	void payFine(Publication publication);
}
