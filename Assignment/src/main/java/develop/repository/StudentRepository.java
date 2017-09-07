package repository;

import domain.Student;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrique on 8/14/2017.
 */
public class StudentRepository implements StudentInterface
{
    private static StudentRepository repository = null;

    private Map<String, Student> studentTable;
    private StudentRepository()
    {
        studentTable = new HashMap<String, Student>();
    }

    public static StudentRepository getInstance()
    {
        if(repository == null)
            repository = new StudentRepository();
        return repository;
    }

    public Student create(Student student)
    {
        studentTable.put(student.getstudName(),student);
        Student savedStudent = studentTable.get(student.getStudNo());
        return savedStudent;
    }

    public Student read(String studName)
    {
        Student student = studentTable.get(studName);
        return student;
    }

    public Student update (Student student)
    {
        studentTable.put(student.getstudName(),student);
        Student savedStudent = studentTable.get(student.getstudName());
        return  savedStudent;
    }

    public void delete(String studName)
    {
        studentTable.remove(studName);
    }

}
