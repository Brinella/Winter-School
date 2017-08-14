package repository;

import domain.Lecturer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rodrique on 8/14/2017.
 */
public class LecturerRepository implements LecturerInterface
{
    private static LecturerRepository repository = null;

    private Map<String, Lecturer> lecturerTable;
    private LecturerRepository()
    {
        lecturerTable = new HashMap<String, Lecturer>();
    }

    public static LecturerRepository getInstance()
    {
        if(repository == null)
            repository = new LecturerRepository();
        return repository;
    }

    public Lecturer create(Lecturer lecturer)
    {
        lecturerTable.put(lecturer.getLectName(),lecturer);
        Lecturer savedLecturer = lecturerTable.get(lecturer.getLectName());
        return savedLecturer;
    }

    public Lecturer read(String lectName)
    {
        Lecturer lecturer = lecturerTable.get(lectName);
        return lecturer;
    }

    public Lecturer update (Lecturer lecturer)
    {
        lecturerTable.put(lecturer.getLectName(),lecturer);
        Lecturer savedLecturer = lecturerTable.get(lecturer.getLectName());
        return  savedLecturer;
    }

    public void delete(String lectName)
    {
        lecturerTable.remove(lectName);
    }

}
