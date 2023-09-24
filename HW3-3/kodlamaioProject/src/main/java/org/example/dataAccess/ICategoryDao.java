package org.example.dataAccess;

import org.example.entities.Category;

import java.util.List;

public interface ICategoryDao {
    public void add(Category category);
    public List<Category> getAll();
    public void update(Category category);
    public void delete(int id);
    public Category getById(int id);
}
