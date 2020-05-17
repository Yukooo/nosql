package it.discovery.nosql.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Person who can write books, for example
 *
 * @author admin
 */
@Getter
@Setter
@Document(collection = "persons")
public class Person extends BaseEntity {
	private String name;

	/**
	 * Books that person has written
	 */
	private List<String> books;

	private Contact contact;
}
