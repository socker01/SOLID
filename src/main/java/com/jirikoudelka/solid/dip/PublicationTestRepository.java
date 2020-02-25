package com.jirikoudelka.solid.dip;

import com.google.common.collect.ImmutableMap;
import com.jirikoudelka.shared.Author;
import com.jirikoudelka.shared.BookState;
import com.jirikoudelka.solid.ocp.Publication;
import com.jirikoudelka.solid.srp.Book;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Date;
import java.util.Map;

/**
 * Test implementation of the {@link PublicationRepository}
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
final class PublicationTestRepository implements PublicationRepository {

    private final Map<Long, Publication> dataSet;

    PublicationTestRepository() {
        Author testAuthor = new Author("test name", 27);
        Book testBook = new Book("testTitle", testAuthor, "sci-fi", new Date(), BookState.NEW);
        this.dataSet = ImmutableMap.of(1L, testBook);
    }

    @Override
    public Publication getPublication(long id) throws RecordNotFoundException {
        if (!dataSet.containsKey(id)) {
            throw new RecordNotFoundException();
        }

        return dataSet.get(id);
    }
}
