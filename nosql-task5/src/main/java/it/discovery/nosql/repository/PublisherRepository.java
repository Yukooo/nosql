package it.discovery.nosql.repository;

import it.discovery.nosql.model.Publisher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublisherRepository extends MongoRepository<Publisher, String> {

}
