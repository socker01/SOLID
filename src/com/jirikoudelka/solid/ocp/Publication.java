package com.jirikoudelka.solid.ocp;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Represents one generic publication in the library.
 *
 * @author Jiri Koudelka
 * @since 05.02.2020
 */
@ParametersAreNonnullByDefault
public interface Publication {

	boolean isReadyForReplacement();
}
