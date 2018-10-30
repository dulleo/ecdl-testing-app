package com.duskol.ecdl.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Answer entity class
 */
@Entity(name="answer")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="answer_id")
    private long id;

    @NotBlank
    @Column(name = "text", unique = true)
    private String text;

    @NotBlank
    @Column(name = "correct")
    private Boolean correct;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", correct=" + correct +
                ", question=" + question +
                '}';
    }
}
