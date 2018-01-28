package com.akg.sm.domain;

import javax.persistence.*;

@Entity
@Table(name = "PARENT")
public class Parent extends Individual{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long parentId;

    @Enumerated
    private Relation relation;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }
}
