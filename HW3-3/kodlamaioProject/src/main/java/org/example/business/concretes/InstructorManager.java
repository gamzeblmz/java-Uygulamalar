package org.example.business.concretes;

import org.example.core.ILogger;
import org.example.dataAccess.IInstructor;
import org.example.entities.Instructor;

import java.util.List;

public class InstructorManager {


    IInstructor iInstructor;
    ILogger[] loggers;

    public InstructorManager(IInstructor iInstructor,ILogger[] loggers) {
        this.iInstructor = iInstructor;
        this.loggers=loggers;
    }

    public void add(Instructor instructor) {
        iInstructor.add(instructor);
        log(instructor.getFirstName()+' '+instructor.getLastName());
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
    public void log(String message){
        for (ILogger logger :loggers){
            logger.Log(message);
        }
    }
}

