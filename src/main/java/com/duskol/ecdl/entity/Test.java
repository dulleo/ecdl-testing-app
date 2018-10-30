package com.duskol.ecdl.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @NotBlank
    @Column(name="name")
    private String name;

    @NotBlank
    @Column(name="active")
    private Boolean active;

    @NotBlank
    @Column(name="duration")
    private int duration;

    @NotBlank
    @Column(name="min_passing_score")
    private int minPassingScore;

    @NotBlank
    @Column(name="bidirectional")
    private Boolean bidirectional;

    @ManyToOne
    @JoinColumn(name="id")
    private AppUser user;

    @OneToMany(mappedBy = "test")
    private List<Question> questions;

    @OneToMany(mappedBy = "test")
    private List<CompletedTest> completedTests;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getMinPassingScore() {
        return minPassingScore;
    }

    public void setMinPassingScore(int minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    public Boolean getBidirectional() {
        return bidirectional;
    }

    public void setBidirectional(Boolean bidirectional) {
        this.bidirectional = bidirectional;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<CompletedTest> getCompletedTests() {
        return completedTests;
    }

    public void setCompletedTests(List<CompletedTest> completedTests) {
        this.completedTests = completedTests;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", duration=" + duration +
                ", minPassingScore=" + minPassingScore +
                ", bidirectional=" + bidirectional +
                ", user=" + user +
                ", questions=" + questions +
                ", completedTests=" + completedTests +
                '}';
    }
}
