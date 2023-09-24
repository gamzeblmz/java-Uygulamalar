package org.example.dataAccess;

import org.example.entities.Course;

import java.util.List;

public interface ICourseDao {
    public void add(Course course);
    public List<Course> getAll();
    public void update(Course course);
    public void delete(Course course);
    public Course getById(int id);
}
