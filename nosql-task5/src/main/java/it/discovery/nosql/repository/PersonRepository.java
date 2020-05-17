package it.discovery.nosql.repository;

import it.discovery.nosql.model.Person;

import java.util.List;

public interface PersonRepository {

	/**
	 * Returns all the persons sorted by name
	 *
	 * @return
	 */
	List<Person> findByOrderByNameAsc();
}
