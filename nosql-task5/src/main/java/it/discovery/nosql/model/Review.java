package it.discovery.nosql.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Review extends BaseEntity {

    private Book book;

    private String comment;

    private int rate;
}
