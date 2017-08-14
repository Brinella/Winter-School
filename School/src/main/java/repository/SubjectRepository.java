package repository;

import domain.Subject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrique on 8/14/2017.
 */
public class SubjectRepository implements SubjectInterface
{
    private static SubjectRepository repository = null;

    private Map<String, Subject> subjectTable;
    private SubjectRepository()
    {
        subjectTable = new HashMap<String, Subject>();
    }

    public static SubjectRepository getInstance()
    {
        if(repository == null)
            repository = new SubjectRepository();
        return repository;
    }

    public Subject create(Subject subject)
    {
        subjectTable.put(subject.getSubjectName(),subject);
        Subject savedWinter = subjectTable.get(subject.getSubjectName());
        return savedWinter;
    }

    public Subject read(String subjectName)
    {
        Subject subject = subjectTable.get(subjectName);
        return subject;
    }

    public Subject update (Subject subject)
    {
        subjectTable.put(subject.getSubjectName(),subject);
        Subject subject1 = subjectTable.get(subject.getSubjectName());
        return  subject1;
    }

    public void delete(String subject)
    {
        subjectTable.remove(subject);
    }

}
