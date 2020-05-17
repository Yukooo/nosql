package it.discovery.nosql.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Book publisher
 */
@Getter
@Setter
public class Publisher extends BaseEntity {
    private String name;

    private List<String> books;

    private Contact contact;
}
