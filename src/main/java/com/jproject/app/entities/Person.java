package com.jproject.app.entities;

import javax.persistence.*;

/*@NamedQueries(
        {
                @NamedQuery(
                        name = "getPeopleByName",
                        query = "SELECT c FROM employees c WHERE c.name LIKE :name "
                )
        }
)*/



@Table(name = "employees")
@Entity
public class Person {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {

    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
