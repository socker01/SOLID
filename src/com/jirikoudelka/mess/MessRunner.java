package com.jirikoudelka.mess;

/**
 * Runner for the presentation of the SOLID principles.
 *
 * @author Jiri Koudelka
 * @since 05.02.2020
 */
public class MessRunner {

	public static void main(String[] args) {

		Author author = new Author("Peter", 27, "Fiction");
		Person pesron = new Person("Peter", 27);

		System.out.println(author.equals(pesron));
		System.out.println(pesron.equals(author));
		// write your code here
	}
}
