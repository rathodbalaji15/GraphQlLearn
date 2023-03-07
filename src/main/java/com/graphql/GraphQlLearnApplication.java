package com.graphql;

import com.graphql.entity.Book;
import com.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQlLearnApplication implements CommandLineRunner {
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1=new Book();
		b1.setPrice(2000);
		b1.setPages(5000);
		b1.setAuthor("XYZ");
		b1.setDesc("For learning java");
		b1.setName("First Head");

		Book b2=new Book();
		b2.setPrice(3000);
		b2.setPages(6000);
		b2.setAuthor("ABC");
		b2.setDesc("For learning PHP");
		b2.setName("First Last");

		Book b3=new Book();
		b3.setPrice(3200);
		b3.setPages(700);
		b3.setAuthor("PQR");
		b3.setDesc("For For concept of Java");
		b3.setName("Head first");
		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);


	}
}
