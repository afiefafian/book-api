package com.afiefafian.book;

import com.afiefafian.book.domain.Book;
import com.afiefafian.book.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			repository.save(new Book("Ini buku 1", "Sastra", "978-3-16-148410-1", 2011));
			repository.save(new Book("Ini buku 2", "Teknologi", "978-3-16-148410-2", 2011));
			repository.save(new Book("Ini buku 3", "Sastra", "978-3-16-148410-3", 2014));
			repository.save(new Book("Ini buku 4", "Teknologi", "978-3-16-148410-4", 2015));
			repository.save(new Book("Ini buku 5", "Sastra", "978-3-16-148410-5", 2011));
			repository.save(new Book("Ini buku 6", "Teknologi", "978-3-16-148410-6", 2010));
			repository.save(new Book("Ini buku 7", "Sastra", "978-3-16-148410-7", 2010));
			repository.save(new Book("Ini buku 8", "Teknologi", "978-3-16-148410-8", 2013));
			repository.save(new Book("Ini buku 9", "Sastra", "978-3-16-148410-9", 2013));
			repository.save(new Book("Ini buku 10", "Teknologi", "978-3-16-148411-0", 2013));
		};
	}
}
