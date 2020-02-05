package com.jirikoudelka.mess;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

/**
 * Represents author as a person.
 *
 * @author Jiri Koudelka
 * @since 05.02.2020
 */
@ParametersAreNonnullByDefault
final class Author extends Person {

	private final String primaryGenre;

	Author(String name, int age, String genre) {
		super(name, age);
		this.primaryGenre = Objects.requireNonNull(genre);
	}

	String getPrimaryGenre() {
		return primaryGenre;
	}
}
