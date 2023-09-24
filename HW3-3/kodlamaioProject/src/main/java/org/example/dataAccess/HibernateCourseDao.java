package org.example.dataAccess;

import org.example.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements ICourseDao {
    List<Course> courses = new ArrayList<>();

    @Override
    public void add(Course course) {
        System.out.println("course added to database with JDBC" + course.getName());
        courses.add(course);
    }

    @Override
    public List<Course> getAll() {
        if(!courses.isEmpty()){
            return courses;
        }
        return null;
    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Course getById(int id) {
         return null;
    }
}
