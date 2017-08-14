package service;

import domain.Subject;

import repository.SubjectInterface;
import repository.SubjectRepository;

/**
 * Created by rodrique on 8/14/2017.
 */
public class SubjectServImpl implements SubjectService
{
    private static SubjectServImpl service = null;
    SubjectInterface repository = SubjectRepository.getInstance();

    public static SubjectServImpl getInstance()
    { if(service == null)
        service = new SubjectServImpl();
        return service;
    }

    public Subject create(Subject subject)
    { return repository.create(subject);}

    public Subject read(String subjectName)
    {return repository.read(subjectName);}

    public Subject update(Subject subject)
    {return repository.update(subject);}

    public void delete(String subjectName)
    {repository.delete(subjectName);}
}
