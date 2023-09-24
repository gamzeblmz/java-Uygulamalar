package org.example.dataAccess;

import org.example.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements ICourseDao {
    List<Course> courses = new ArrayList<>();

    @Override
    public void add(Course course) {
        System.out.println("course added to database with Hibernate" + course.getName());
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
        System.out.println("Updated in database with Hibernate : " + course.getName());
    }

    @Override
    public void delete(Course course) {
       courses.remove(course);
        System.out.println("course is deleted in database with Hibernate");
    }

    @Override
    public Course getById(int id) {
        for (Course course1 : courses) {
            if (course1.getId()==id) {
               return course1;
            }
        }
        return null;
    }
}
