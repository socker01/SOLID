package com.jirikoudelka.solid.dip;

import com.jirikoudelka.solid.ocp.Publication;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;
import java.util.Optional;

/**
 * Default implementation of the {@link PublicationService}
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
final class PublicationProdService implements PublicationService {

    private final PublicationRepository publicationRepository;

    PublicationProdService(PublicationRepository publicationRepository) {
        this.publicationRepository = Objects.requireNonNull(publicationRepository);
    }

    @Override
    public Optional<Publication> findPublication(long id) {
        try {
            return Optional.of(publicationRepository.getPublication(id));
        } catch (RecordNotFoundException e) {
            return Optional.empty();
        }
    }
}
