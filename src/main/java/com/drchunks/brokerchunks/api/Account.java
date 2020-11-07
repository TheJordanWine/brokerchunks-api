package com.drchunks.brokerchunks.api;

import java.util.ArrayList;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Account {
    @Id
    private String id;
    private String title;
    private ArrayList<User> users;
    private ArrayList<Budget> budgets;

    public Account() {
    }

    public Account(String title, ArrayList<User> users, ArrayList<Budget> budgets) {
        this.title = title;
        this.users = users;
        this.budgets = budgets;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Budget> getBudgets() {
        return this.budgets;
    }

    public void setBudgets(ArrayList<Budget> budgets) {
        this.budgets = budgets;
    }

    public Account title(String title) {
        this.title = title;
        return this;
    }

    public Account users(ArrayList<User> users) {
        this.users = users;
        return this;
    }

    public Account budgets(ArrayList<Budget> budgets) {
        this.budgets = budgets;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Account)) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(title, account.title) && Objects.equals(users, account.users)
                && Objects.equals(budgets, account.budgets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, users, budgets);
    }

    @Override
    public String toString() {
        return "{" + " title='" + getTitle() + "'" + ", users='" + getUsers() + "'" + ", budgets='" + getBudgets() + "'"
                + "}";
    }
}
