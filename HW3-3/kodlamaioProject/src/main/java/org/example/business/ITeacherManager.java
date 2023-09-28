package org.example.business;

import org.example.entities.Instructor;

import java.util.List;

public interface ITeacherManager {
    public void add(Instructor instructor);
    public List<Instructor> getAll();
    public void update(Instructor instructor);
    public void delete(int id);
    public void getById(int id);
}
