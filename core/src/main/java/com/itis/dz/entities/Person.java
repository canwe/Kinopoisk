package com.itis.dz.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Регина on 08.10.2016.
 */
@Entity
@Table(name = "persons")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String lastName;

    @Column
    private String firstName;

    @Column
    private String secondName;

    @Column
    private String role;

    @Column
    private String awards;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "persons")
    private List<Movie> movies;


    public Person() {
    }

    public Person(String lastName, String firstName, String secondName, String role, String awards) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.role = role;
        this.awards = awards;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }
}

