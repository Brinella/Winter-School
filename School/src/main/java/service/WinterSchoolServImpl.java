package service;

import domain.WinterSchool;
import repository.WinterSchoolRepository;
import repository.WinterSchoolInterface;

/**
 * Created by rodrique on 8/14/2017.
 */
public class WinterSchoolServImpl implements WinterSchoolService
{
    private static WinterSchoolServImpl service = null;

    WinterSchoolInterface repository = WinterSchoolRepository.getInstance();

    public static WinterSchoolServImpl getInstance()
    { if(service == null)
        service = new WinterSchoolServImpl();
        return service;
    }

    public WinterSchool create(WinterSchool winterSchool)
    { return repository.create(winterSchool);}

    public WinterSchool read(String subject)
    {return repository.read(subject);}

    public WinterSchool update(WinterSchool winterSchool)
    {return repository.update(winterSchool);}

    public void delete(String subject)
    {repository.delete(subject);}
}
