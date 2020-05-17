package it.discovery.hibernate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
@Getter
@Setter
public class Contact {
	private String phone;

	private String email;

	@Embedded
	private Address address;
}
