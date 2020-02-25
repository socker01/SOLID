package com.jirikoudelka.solid.dip;

/**
 * {@link PublicationService} test
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
final class PublicationProdServiceTest {
    private final PublicationService publicationService;

    public PublicationProdServiceTest() {
        this.publicationService = new PublicationProdService(new PublicationTestRepository());
    }
}