package com.duskol.ecdl.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

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
}
