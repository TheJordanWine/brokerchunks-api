package com.drchunks.brokerchunks.api;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Transaction {
    @Id
    private String id;
    private BigDecimal amount;
    private Category category;
    private String store;
    private Date date;

    public Transaction() {
    }

    public Transaction(BigDecimal amount, Category category, String store, Date date) {
        this.amount = amount;
        this.category = category;
        this.store = store;
        this.date = date;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getStore() {
        return this.store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Transaction amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public Transaction Category(Category category) {
        this.category = category;
        return this;
    }

    public Transaction store(String store) {
        this.store = store;
        return this;
    }

    public Transaction date(Date date) {
        this.date = date;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) o;
        return amount == transaction.amount && Objects.equals(category, transaction.category)
                && Objects.equals(store, transaction.store) && Objects.equals(date, transaction.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, category, store, date);
    }

    @Override
    public String toString() {
        return "{" + " amount='" + getAmount() + "'" + ", category='" + getCategory() + "'" + ", store='" + getStore()
                + "'" + ", date='" + getDate() + "'" + "}";
    }

}
