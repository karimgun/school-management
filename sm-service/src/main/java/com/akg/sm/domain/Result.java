package com.akg.sm.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resultId;

    @ManyToOne
    private Exam exam;

    @ManyToOne
    private Student student;

    @ManyToMany
    private List<Marks> marks;

    private Float total;
    private Float percent;
}
