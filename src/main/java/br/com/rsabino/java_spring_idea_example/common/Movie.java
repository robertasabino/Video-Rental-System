package br.com.rsabino.java_spring_idea_example.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie {

    @Id
    private int id;
    @Column(name="producer_id")
    private int producerId;
    @Column(name = "title")
    private String title;
    @Column(name="duration")
    private int duration;
    @Column(name="rating")
    private char rating;

}
