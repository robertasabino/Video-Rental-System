package br.com.rsabino.java_spring_idea_example.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name="customer_movie_test")
public class CustomerMovie {

    @Id
    @Column(name = "movie_id")
    private int movieId;
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "date_rented")
    private Date dateRented;
    @Column(name = "date_due")
    private Date dateDue;

}
