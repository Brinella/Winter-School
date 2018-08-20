package Services;

import Domain.Hires;
/**
 * Created by Emma on 8/12/2018.
 */
//hire
public interface HiresServices
{
    Hires create(Hires hired);
    Hires read(long id);
    Hires update(Hires hired);
    void delete(long id);

}
