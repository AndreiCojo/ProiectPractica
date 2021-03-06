package com.marketplace.model;

import javax.persistence.*;

@Entity
@Table(name="hobbies")
public class Hobby {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Hobby() {
    }

    public Hobby(String name) {
        this.name=name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
}
