package org.example;

import org.example.business.concretes.CategoryManager;
import org.example.business.concretes.CourseManager;
import org.example.business.concretes.InstructorManager;
import org.example.dataAccess.HibernateCategoryDao;
import org.example.dataAccess.HibernateCourseDao;
import org.example.dataAccess.JdbcCourseDao;
import org.example.dataAccess.JdbcInstructorDao;
import org.example.entities.Category;
import org.example.entities.Course;
import org.example.entities.Instructor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course(1, "Java", 10);
        Course course2 = new Course(2, ".NET", 10);
        Course course3 = new Course(3, "Java", 10);
        Course course4 = new Course(3, "Phyton", -10);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao());
        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);
        courseManager.add(course4);
        courseManager.getById(2);
        courseManager.delete(course1);

        Category category1 = new Category(1, "Programlama");
        Category category2 = new Category(2, "Analiz");
        Category category3 = new Category(3, "Test");
        Category category4 = new Category(4, "Programlama");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);
        categoryManager.add(category4);
        categoryManager.delete(category3);
        List<Category> categories = categoryManager.getAll();
        for (Category category : categories) {
            System.out.println(category.getName());
        }

        Instructor instructor1 = new Instructor(1, "Engin", "Demirog");
        Instructor instructor2 = new Instructor(2, "Irem", "Balci");
        Instructor instructor3 = new Instructor(3, "Gamze", "Bilmez");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao());
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        instructorManager.add(instructor3);
        Instructor updateinstructor = new Instructor(3, "Yusuf", "Bilmez");
        instructorManager.update(updateinstructor);
        List<Instructor> instructors = instructorManager.getAll();
        for (Instructor instructor : instructors) {
            System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
        }


    }
}