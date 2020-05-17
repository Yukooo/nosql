package it.discovery.hibernate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
@Getter
@Setter
public class Review extends BaseEntity {

	@ManyToOne(optional = false)
	@JoinColumn(name = "BOOK_ID")
	private Book book;

	private String comment;

	private int rate;
}
