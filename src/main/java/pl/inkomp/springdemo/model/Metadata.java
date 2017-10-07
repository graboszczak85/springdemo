package pl.inkomp.springdemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Metadata {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String metadata;

}
