package org.example.dataAccess;

import org.example.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JdbcInstructorDao implements IInstructor {
    List<Instructor> instructors = new ArrayList<>();

    @Override
    public void add(Instructor instructor) {
        System.out.println("Teacher added to database with JDBC: " + instructor.getFirstName() + " " + instructor.getLastName());
        instructors.add(instructor);
    }

    @Override
    public List<Instructor> getAll() {
        if (!instructors.isEmpty()) {
            return instructors;
        }
        return null;
    }

    @Override
    public void update(Instructor instructor) {
        for (Instructor instructor1 : instructors) {
            if (instructor1.getId() == instructor.getId()) {
                instructor1.setFirstName(instructor.getFirstName());
                instructor1.setLastName(instructor.getLastName());
                System.out.println("Updated in database with JDBC : " + instructor.getFirstName() + " " + instructor.getLastName());
                return;
            }
        }
        System.out.println("teacher not found with JDBC ");
    }

    @Override
    public void delete(Instructor instructor) {
        instructors.remove(instructor);
        System.out.println("teacher is deleted in database with JDBC");
    }

    @Override
    public Instructor getById(int id) {
        for (Instructor instructor : instructors) {
            if (instructor.getId() == id) {
                return instructor;
            }
        }
        return null;
    }
}
