package com.jirikoudelka.mess.dip;

import com.jirikoudelka.mess.srp.Book;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Repository for the Book entity
 *
 * @author Jiri Koudelka
 * @since 10.02.2020
 */
@ParametersAreNonnullByDefault
final class BookRepository {

    @Nullable
    Book loadBook(String title) {
        //load book from database
        return null;
    }
}
