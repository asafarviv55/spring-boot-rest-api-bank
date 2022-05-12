package com.alfa.bank.models;

import javax.persistence.*;

@Entity
@Table(name = "foreign_trade")
public class ForeignTrade {
    @Id
    @Column(name = "id")
    private Integer id;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
