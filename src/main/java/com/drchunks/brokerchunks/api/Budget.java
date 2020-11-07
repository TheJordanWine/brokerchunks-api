package com.drchunks.brokerchunks.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Budget {
    @Id
    private String id;
    private ArrayList<Category> categories;
    private ArrayList<CategoryGroup> categoryGroups;
    private Date startDate;
    private Date endDate;

    public Budget() {
    }

    public Budget(ArrayList<Category> categories, ArrayList<CategoryGroup> categoryGroups, Date startDate,
            Date endDate) {
        this.categories = categories;
        this.categoryGroups = categoryGroups;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public ArrayList<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public ArrayList<CategoryGroup> getCategoryGroups() {
        return this.categoryGroups;
    }

    public void setCategoryGroups(ArrayList<CategoryGroup> categoryGroups) {
        this.categoryGroups = categoryGroups;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Budget categories(ArrayList<Category> categories) {
        this.categories = categories;
        return this;
    }

    public Budget categoryGroups(ArrayList<CategoryGroup> categoryGroups) {
        this.categoryGroups = categoryGroups;
        return this;
    }

    public Budget startDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Budget endDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Budget)) {
            return false;
        }
        Budget budget = (Budget) o;
        return Objects.equals(categories, budget.categories) && Objects.equals(categoryGroups, budget.categoryGroups)
                && Objects.equals(startDate, budget.startDate) && Objects.equals(endDate, budget.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categories, categoryGroups, startDate, endDate);
    }

    @Override
    public String toString() {
        return "{" + " categories='" + getCategories() + "'" + ", categoryGroups='" + getCategoryGroups() + "'"
                + ", startDate='" + getStartDate() + "'" + ", endDate='" + getEndDate() + "'" + "}";
    }

}
