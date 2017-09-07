package service;

import domain.Subject;

/**
 * Created by rodrique on 8/11/2017.
 */
public interface SubjectService
{
    Subject create(Subject subject);
    Subject read(String subjectName);
    Subject update(Subject subject);
    void    delete(String subjectName);
}
