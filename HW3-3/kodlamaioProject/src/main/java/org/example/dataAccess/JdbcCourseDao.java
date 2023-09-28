package org.example.dataAccess;

import org.example.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements ICourseDao {
    List<Course> courses = new ArrayList<>();

    @Override
    public void add(Course course) {
        System.out.println("course added to database with JDBC" + course.getName());
        courses.add(course);
    }

    @Override
    public List<Course> getAll() {
        if (!courses.isEmpty()) {
            return courses;
        }
        return null;
    }

    @Override
    public void update(Course course) {
        for (Course course1 : courses) {
            if (course1.getId() == course.getId()) {
                course1.setName(course.getName());
                System.out.println("Updated in database with JDBC : " + course.getName());
                return;
            }
        }
        System.out.println("course not found with JDBC");
    }

    @Override
    public void delete(Course course) {
        courses.remove(course);
        System.out.println("course is deleted in database with JDBC");
    }

    @Override
    public Course getById(int id) {
        for (Course course1 : courses) {
            if (course1.getId() == id) {
                return course1;
            }
        }
        return null;
    }
}
