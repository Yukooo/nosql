package it.discovery.nosql.service;

import it.discovery.nosql.model.Book;
import it.discovery.nosql.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

	private final BookRepository bookRepository;

	public List<Book> findByName(String name) {
		return bookRepository.findByName(name);
	}

	public void saveBook(Book book) {
		bookRepository.save(book);
	}
}
