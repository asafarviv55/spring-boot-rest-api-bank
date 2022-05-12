package com.alfa.bank.models;

import javax.persistence.*;

@Entity
@Table(name = "loans")
public class Loans {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "owner")
    private Integer owner;

    @Column(name = "loan_balance")
    private Integer loanBalance;

    @Column(name = "created_at")
    private java.sql.Timestamp createdAt;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwner() {
        return this.owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    public Integer getLoanBalance() {
        return this.loanBalance;
    }

    public void setLoanBalance(Integer loanBalance) {
        this.loanBalance = loanBalance;
    }

    public java.sql.Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(java.sql.Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
