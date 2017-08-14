package service;

import domain.Student;
import repository.StudentInterface;
import repository.StudentRepository;

/**
 * Created by rodrique on 8/14/2017.
 */
public class StudentServImpl implements StudentService
{
    private static StudentServImpl service = null;

    StudentInterface repository = StudentRepository.getInstance();

    public static StudentServImpl getInstance()
    { if(service == null)
        service = new StudentServImpl();
        return service;
    }

    public Student create(Student student)
    { return repository.create(student);}

    public Student read(String name)
    {return repository.read(name);}

    public Student update(Student student)
    {return repository.update(student);}

    public void delete(String name)
    {repository.delete(name);}
}
