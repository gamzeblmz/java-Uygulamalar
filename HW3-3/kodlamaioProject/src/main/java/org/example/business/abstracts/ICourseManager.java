package org.example.business.abstracts;

import org.example.entities.Course;

import java.util.List;

public interface ICourseManager {
    public void add(Course course);
    public List<Course> getAll();
    public void update(Course course);
    public void delete(int id);
    public void getById(int id);
}
