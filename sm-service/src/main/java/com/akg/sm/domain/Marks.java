package com.akg.sm.domain;

import javax.persistence.*;

@Entity
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer marksId;

    @ManyToOne
    private Subject subject;

    @Column
    private Integer marksObtained;

    @Column
    private Boolean result;

}
