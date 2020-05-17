package it.discovery.nosql.config;

import it.discovery.nosql.model.Book;
import it.discovery.nosql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.index.Index;

import javax.annotation.PostConstruct;

@Configuration
@EnableMongoAuditing
public class MongoConfiguration {

    @Autowired
    private MongoOperations mongoOperations;

    @PostConstruct
    public void setup() {
        mongoOperations.indexOps(Book.class).ensureIndex(new Index().on("names.text", Sort.Direction.ASC));
        mongoOperations.indexOps(Book.class).ensureIndex(new Index().on("author.name", Sort.Direction.ASC));
    }

    @Bean
    public MongoTransactionManager mongoTransactionManager(MongoDatabaseFactory db) {
        return new MongoTransactionManager(db);
    }

    @Bean
    public BookService bookService(MongoOperations mongoOperations) {
        return new BookService(mongoOperations);
    }
}
