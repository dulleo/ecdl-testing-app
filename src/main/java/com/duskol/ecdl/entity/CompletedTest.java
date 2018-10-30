package com.duskol.ecdl.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Calendar;

/**
 * CompletedTest entity class
 */
@Entity(name = "completed_test")
public class CompletedTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @NotBlank
    @Column(name = "score")
    private float score;

    @NotBlank
    @Column(name = "status")
    private CompletedTestStatus status;

    @NotBlank
    @Column(name = "total_questions")
    private int totalQuestions;

    @NotBlank
    @Column(name = "correct")
    private int correct;

    @NotBlank
    @Column(name = "incorrect")
    private int incorrect;

    @NotBlank
    @Column(name = "completion_date")
    @org.hibernate.annotations.CreationTimestamp
    private Calendar completiondDate;

    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private AppUser user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public CompletedTestStatus getStatus() {
        return status;
    }

    public void setStatus(CompletedTestStatus status) {
        this.status = status;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public int getIncorrect() {
        return incorrect;
    }

    public void setIncorrect(int incorrect) {
        this.incorrect = incorrect;
    }

    public Calendar getCompletiondDate() {
        return completiondDate;
    }

    public void setCompletiondDate(Calendar completiondDate) {
        this.completiondDate = completiondDate;
    }

    @Override
    public String toString() {
        return "CompletedTest{" +
                "id=" + id +
                ", score=" + score +
                ", status=" + status +
                ", totalQuestions=" + totalQuestions +
                ", correct=" + correct +
                ", incorrect=" + incorrect +
                ", completiondDate=" + completiondDate +
                '}';
    }
}
