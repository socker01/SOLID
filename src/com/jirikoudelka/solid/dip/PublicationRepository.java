package com.jirikoudelka.solid.dip;

import com.jirikoudelka.solid.ocp.Publication;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Publication repository
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
public interface PublicationRepository {
    Publication getPublication(long id) throws RecordNotFoundException;
}
