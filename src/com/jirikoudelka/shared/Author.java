package com.jirikoudelka.shared;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

/**
 * Represents author
 *
 * @author Jiri Koudelka
 * @since 05.02.2020
 */
@ParametersAreNonnullByDefault
public final class Author {

	private final String name;
	private final int age;

	Author(String name, int age) {
		this.name = Objects.requireNonNull(name);
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
