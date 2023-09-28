package org.example.business.concretes;

import org.example.dataAccess.ICourseDao;
import org.example.entities.Course;

import java.util.List;

public class CourseManager {
    ICourseDao iCourseDao;

    public CourseManager(ICourseDao iCourseDao) {
        this.iCourseDao = iCourseDao;
    }

    public void add(Course course) {
        if (course.getPrice() < 0) {
            System.out.println("The price of a course cannot be less than 0");
            return;
        }
        List<Course> courses = iCourseDao.getAll();
        if (courses != null) {
            for (Course course1 : courses) {
                if (course1.getName() == course.getName()) {
                    System.out.println("You cannot save a course with the same name.");
                    return;
                }
            }
        }
        iCourseDao.add(course);
    }

    public List<Course> getAll() {
        return iCourseDao.getAll();
    }

    public void update(Course course) {
        iCourseDao.update(course);
    }

    public void delete(Course course) {
        iCourseDao.delete(course);
    }

    public Course getById(int id) {
        Course course = iCourseDao.getById(id);
        System.out.println(course.getName());
        return course;
    }
}
