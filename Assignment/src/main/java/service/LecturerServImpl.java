package service;

import domain.Lecturer;
import repository.LecturerInterface;
import repository.LecturerRepository;

/**
 * Created by rodrique on 8/14/2017.
 */
public class LecturerServImpl
{
    private static LecturerServImpl service = null;

    LecturerInterface repository = LecturerRepository.getInstance();

    public static LecturerServImpl getInstance()
    { if(service == null)
        service = new LecturerServImpl();
        return service;
    }

    public Lecturer create(Lecturer lecturer)
    { return repository.create(lecturer);}

    public Lecturer read(String lectName)
    {return repository.read(lectName);}

    public Lecturer update(Lecturer lecturer)
    {return repository.update(lecturer);}

    public void delete(String lectName)
    {repository.delete(lectName);}
}
