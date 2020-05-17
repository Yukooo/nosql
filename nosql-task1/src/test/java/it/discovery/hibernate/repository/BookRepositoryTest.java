package it.discovery.hibernate.repository;

import it.discovery.hibernate.model.Book;
import it.discovery.hibernate.model.Person;
import it.discovery.hibernate.model.Publisher;
import it.discovery.hibernate.model.Review;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
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
		book1.setNameEn("JPA");
		book1.setAuthor(author);
		book1.setPublisher(publisher);

		Book book2 = new Book();
		book2.setNameEn("Hibernate");
		book2.setAuthor(author);
		book2.setPublisher(publisher);

		Review review = new Review();
		review.setComment("good");
		review.setRate(10);
		book2.addReview(review);
		bookRepository.saveAll(List.of(book1, book2));

		List<Book> books = bookRepository.findWithReviews();
		assertEquals(1, books.size());
		assertEquals("Hibernate", books.get(0).getNameEn());
	}

}
