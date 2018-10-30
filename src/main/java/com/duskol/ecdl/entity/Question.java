package com.duskol.ecdl.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Question entity lass
 */
@Entity
@Table(name="question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "text", unique = true)
    private String text;

    @NotBlank
    @Column(name = "type")
    private QuestionType type;

    @ManyToOne
    @JoinColumn(name = "test_id")
    private Test test;

    @OneToMany(mappedBy = "question")
    @Size(min = 2, max = 10)
    private List<Answer> answers;

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

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", type=" + type +
                ", test=" + test +
                ", answers=" + answers +
                '}';
    }
}
