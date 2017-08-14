package service;

import domain.Lecturer;

/**
 * Created by rodrique on 8/11/2017.
 */
public interface LecturerService
{
    Lecturer create(Lecturer lecturer);
    Lecturer read(String lectName);
    Lecturer update(Lecturer lecturer);
    void   delete(String lectName);
}
