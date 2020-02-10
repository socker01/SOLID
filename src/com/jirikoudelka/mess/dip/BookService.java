package com.jirikoudelka.mess.dip;

import com.jirikoudelka.mess.srp.Book;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;
import java.util.Optional;

/**
 * Service for manipulation with Book entity
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
final class BookService {

    private final BookRepository bookRepository;

    BookService() {
        this.bookRepository = new BookRepository();
    }

    public Optional<Book> findBook(String title){
        Objects.requireNonNull(title);

        return Optional.ofNullable(bookRepository.loadBook(title));
    }
}
