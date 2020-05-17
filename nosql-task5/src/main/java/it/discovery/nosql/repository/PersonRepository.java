package it.discovery.nosql.repository;

import it.discovery.nosql.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {

	/**
	 * Returns all the persons sorted by name
	 *
	 * @return
	 */
	List<Person> findByOrderByNameAsc();
}
