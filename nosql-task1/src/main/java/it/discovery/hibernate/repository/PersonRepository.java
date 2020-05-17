package it.discovery.hibernate.repository;

import it.discovery.hibernate.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	/**
	 * Returns all the persons sorted by name
	 *
	 * @return
	 */
	List<Person> findByOrderByNameAsc();
}
