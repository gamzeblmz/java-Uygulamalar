package org.example.dataAccess;

import org.example.entities.Instructor;

import java.util.List;

public interface IInstructor {
    public void add(Instructor category);

    public List<Instructor> getAll();

    public void update(Instructor category);

    public void delete(Instructor instructor);

    public Instructor getById(int id);
}
