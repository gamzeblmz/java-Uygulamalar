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
        return null;
    }


    public void update(Course course) {

    }


    public void delete(int id) {

    }


    public void getById(int id) {

    }
}
