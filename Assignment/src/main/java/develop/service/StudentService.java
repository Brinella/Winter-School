package service;

import domain.Student;

/**
 * Created by rodrique on 8/11/2017.
 */
public interface StudentService
{
    Student create(Student student);
    Student read(String studName);
    Student update(Student student);
    void delete(String studName);
}

