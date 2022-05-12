package com.alfa.bank.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "credit_expenses")
public class CreditExpenses {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="owner", referencedColumnName = "id")
    private User owner;


    @Column(name="expense_amount")
    private long amount;


    @Column(name = "created_at")
    private java.sql.Timestamp createdAt;


    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getOwner() {  return owner;  }

    public void setOwner(User owner) { this.owner = owner;  }

    public java.sql.Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(java.sql.Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditExpenses that = (CreditExpenses) o;
        return amount == that.amount && id.equals(that.id) && owner.equals(that.owner) && createdAt.equals(that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, owner, amount, createdAt);
    }

    @Override
    public String toString() {
        return "CreditExpenses{" +
                "id=" + id +
                ", owner=" + owner +
                ", amount=" + amount +
                ", createdAt=" + createdAt +
                '}';
    }

}
