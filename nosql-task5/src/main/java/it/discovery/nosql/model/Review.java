package it.discovery.nosql.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Review {

    private String comment;

    private int rate;

    private LocalDateTime created;
}
