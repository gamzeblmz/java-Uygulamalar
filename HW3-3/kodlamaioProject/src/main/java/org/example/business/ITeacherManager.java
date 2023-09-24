package org.example.business;

import org.example.entities.Teacher;

import java.util.List;

public interface ITeacherManager {
    public void add(Teacher teacher);
    public List<Teacher> getAll();
    public void update(Teacher teacher);
    public void delete(int id);
    public void getById(int id);
}
