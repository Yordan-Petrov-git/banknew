package com.advance.academy.bank.system.data.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {

    long id;

    public BaseEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseEntity{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}