package org.example.business.concretes;

import org.example.dataAccess.IInstructor;
import org.example.entities.Instructor;

import java.util.List;

public class InstructorManager {


    IInstructor iInstructor;

    public InstructorManager(IInstructor iInstructor) {
        this.iInstructor = iInstructor;
    }

    public void add(Instructor instructor) {
        iInstructor.add(instructor);
    }


    public List<Instructor> getAll() {
        return iInstructor.getAll();
    }


    public void update(Instructor instructor) {
        iInstructor.update(instructor);
    }


    public void delete(Instructor instructor) {
        iInstructor.delete(instructor);
    }


    public Instructor getById(int id) {
        return iInstructor.getById(id);
    }
}
