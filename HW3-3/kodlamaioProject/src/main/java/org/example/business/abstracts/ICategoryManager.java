package org.example.business.abstracts;

import org.example.entities.Category;
import java.util.List;

public interface ICategoryManager {
    public void add(Category category);
    public List<Category> getAll();
    public void update(Category category);
    public void delete(int id);
    public void getById(int id);
}
