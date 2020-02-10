package com.jirikoudelka.solid.dip;

import com.jirikoudelka.solid.ocp.Publication;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Optional;

/**
 * Service for manipulation with publication
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
public interface PublicationService {
    Optional<Publication> findPublication(long id);
}
