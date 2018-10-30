package com.duskol.ecdl.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * AppUser entity class
 */
@Entity(name = "user")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Column(name = "email", unique = true)
    private String email;

    @NotBlank
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<CompletedTest> completedTests;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CompletedTest> getCompletedTests() {
        return completedTests;
    }

    public void setCompletedTests(List<CompletedTest> completedTests) {
        this.completedTests = completedTests;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", completedTests=" + completedTests +
                '}';
    }
}
