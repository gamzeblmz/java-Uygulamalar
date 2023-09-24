package org.example.dataAccess;

import org.example.entities.Category;
import org.example.entities.Teacher;

import java.util.List;

public interface ITeacherDao {
    public void add(Category category);
    public List<Category> getAll();
    public void update(Category category);
    public void delete(int id);
    public Teacher getById(int id);
}
