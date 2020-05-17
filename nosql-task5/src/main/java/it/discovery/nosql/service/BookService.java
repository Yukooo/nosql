package it.discovery.nosql.service;

import it.discovery.nosql.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@RequiredArgsConstructor
public class BookService {

    private final MongoOperations mongoOperations;

    public List<Book> findByName(String name) {
        return mongoOperations.find(new Query(Criteria.where("names.text").is(name)), Book.class);
    }

    public void saveBook(Book book) {
        mongoOperations.save(book);
    }
}
