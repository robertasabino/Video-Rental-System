package br.com.rsabino.java_spring_idea_example.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "producer")
public class Producer {

    @Id
    private int id;
    @Column (name = "company_name")
    private String companyName;
    @Column (name = "country")
    private String country;

}
