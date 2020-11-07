package com.drchunks.brokerchunks.api;

import java.util.ArrayList;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class CategoryGroup {
    @Id
    private String id;
    private String title;
    private ArrayList<Category> categories;

    public CategoryGroup() {
    }

    public CategoryGroup(String title, ArrayList<Category> categories) {
        this.title = title;
        this.categories = categories;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public CategoryGroup title(String title) {
        this.title = title;
        return this;
    }

    public CategoryGroup categories(ArrayList<Category> categories) {
        this.categories = categories;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CategoryGroup)) {
            return false;
        }
        CategoryGroup categoryGroup = (CategoryGroup) o;
        return Objects.equals(title, categoryGroup.title) && Objects.equals(categories, categoryGroup.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, categories);
    }

    @Override
    public String toString() {
        return "{" + " title='" + getTitle() + "'" + ", categories='" + getCategories() + "'" + "}";
    }

}
