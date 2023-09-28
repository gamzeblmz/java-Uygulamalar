package org.example.dataAccess;

import org.example.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements ICategoryDao {
    List<Category> categories = new ArrayList<>();

    @Override
    public void add(Category category) {
        System.out.println("Category added to database with Hibernate" + category.getName());
        categories.add(category);
    }

    @Override
    public List<Category> getAll() {
        if (!categories.isEmpty()) {
            return categories;
        }
        return null;
    }

    @Override
    public void update(Category category) {
        for (Category category1 : categories) {
            if (category1.getId() == category.getId()) {
                category1.setName(category.getName());
                System.out.println("Updated in database with Hibernate : " + category.getName());
                return;
            }
        }
        System.out.println("category not found with Hibernate");
    }

    @Override
    public void delete(Category category) {
        categories.remove(category);
        System.out.println("course is deleted in database with Hibernate");
    }

    @Override
    public Category getById(int id) {
        for (Category category : categories) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
