package com.jirikoudelka.mess;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

/**
 * Represents general person
 *
 * @author Jiri Koudelka
 * @since 05.02.2020
 */
@ParametersAreNonnullByDefault
class Person {

	private final String name;
	private final int age;

	Person(String name, int  age) {
		this.name = Objects.requireNonNull(name);
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person pesron = (Person) o;
		return age == pesron.age &&
				Objects.equals(name, pesron.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}
