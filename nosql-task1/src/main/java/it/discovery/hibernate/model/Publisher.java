package it.discovery.hibernate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Book publisher
 */
@Getter
@Setter
@Table
@Entity
public class Publisher extends BaseEntity {
	private String name;

	@OneToMany(mappedBy = "publisher")
	private List<Book> books;

	@Embedded
	private Contact contact;
}
