package com.alfa.bank.models;

import javax.persistence.*;

@Entity
@Table(name = "pass_back_operations")
public class PassBackOperations {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "owner")
    private Integer owner;

    @Column(name = "isCharge")
    private Byte isCharge;

    @Column(name = "account_balance")
    private Float accountBalance;

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

    public Byte getIsCharge() {
        return this.isCharge;
    }

    public void setIsCharge(Byte isCharge) {
        this.isCharge = isCharge;
    }

    public Float getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public java.sql.Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(java.sql.Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
