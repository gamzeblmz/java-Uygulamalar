package org.example.dataAccess;

import org.example.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements ICourseDao{
    List<Course> courses= new ArrayList<>();
    @Override
    public void add(Course course) {

    }

    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void getById(int id) {

    }
}
