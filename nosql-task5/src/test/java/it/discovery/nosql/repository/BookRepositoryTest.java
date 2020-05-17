package it.discovery.nosql.repository;

import it.discovery.nosql.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRepositoryTest {

	@Autowired
	BookRepository bookRepository;

	@Test
	void findWithReviews_returnsSingleBook() {
		Person author = new Person();
		author.setName("Gavin King");
		Publisher publisher = new Publisher();
		publisher.setName("Packt");

		Book book1 = new Book();
		book1.addTranslation(new Translation("JPA", "en"));
		book1.setAuthor(new PersonInfo(author.getId(), author.getName()));
		book1.setPublisherId(publisher.getId());

		Book book2 = new Book();
		book2.addTranslation(new Translation("Hibernate", "en"));
		book2.setAuthor(new PersonInfo(author.getId(), author.getName()));
		book2.setPublisherId(publisher.getId());

		Review review = new Review();
		review.setComment("good");
		review.setRate(10);
		book2.addReview(review);
		//bookRepository.saveAll(List.of(book1, book2));

		List<Book> books = bookRepository.findWithReviews();
		assertEquals(1, books.size());
		assertEquals("Hibernate", books.get(0).getNames().get(0).getText());
	}

}
