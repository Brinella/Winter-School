package repository;

import domain.WinterSchool;
import repository.WinterSchoolInterface;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by rodrique on 8/11/2017.
 */
public class WinterSchoolRepository implements WinterSchoolInterface
{
    private static WinterSchoolRepository repository = null;

    private Map<String, WinterSchool>winterTable;
    private WinterSchoolRepository()
    {
        winterTable = new HashMap<String, WinterSchool>();
    }

    public static WinterSchoolRepository getInstance()
    {
        if(repository == null)
            repository = new WinterSchoolRepository();
            return repository;
    }

    public WinterSchool create(WinterSchool winterSchool)
    {
        winterTable.put(winterSchool.getSubject(),winterSchool);
        WinterSchool savedWinter = winterTable.get(winterSchool.getSubject());
        return savedWinter;
    }

    public WinterSchool read(String subject)
    {
        WinterSchool winterSchool = winterTable.get(subject);
        return winterSchool;
    }

    public WinterSchool update (WinterSchool winterSchool)
    {
       winterTable.put(winterSchool.getSubject(),winterSchool);
       WinterSchool savedWinter = winterTable.get(winterSchool.getSubject());
       return  savedWinter;
    }

    public void delete(String subject)
    {
        winterTable.remove(subject);
    }

}
