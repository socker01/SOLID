package com.jirikoudelka.solid.dip;

import com.jirikoudelka.solid.ocp.Publication;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Default implementation of the {@link PublicationRepository}
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
final class PublicationProdRepository implements PublicationRepository {
    @Override
    public Publication getPublication(long id) throws RecordNotFoundException {
        // load publication from the database
        return null;
    }
}
