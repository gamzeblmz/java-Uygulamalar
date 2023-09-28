package org.example;

import org.example.business.concretes.CourseManager;
import org.example.dataAccess.HibernateCourseDao;
import org.example.entities.Course;

public class Main {
    public static void main(String[] args) {
        Course course1= new Course(1,"Java",10);
        CourseManager courseManager= new CourseManager(new HibernateCourseDao());
        courseManager.add(course1);
    }
}