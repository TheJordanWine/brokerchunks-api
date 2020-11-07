package com.drchunks.brokerchunks.api;

import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Category {
    @Id
    private String id;
    private String title;
    private BigDecimal amount;

    public Category() {
    }

    public Category(String title, BigDecimal amount) {
        this.title = title;
        this.amount = amount;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Category title(String title) {
        this.title = title;
        return this;
    }

    public Category amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Category)) {
            return false;
        }
        Category category = (Category) o;
        return Objects.equals(title, category.title) && Objects.equals(amount, category.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, amount);
    }

    @Override
    public String toString() {
        return "{" + " title='" + getTitle() + "'" + ", amount='" + getAmount() + "'" + "}";
    }
}
