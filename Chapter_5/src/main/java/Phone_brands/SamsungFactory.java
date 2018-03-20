package Phone_brands;

/**
 * Created by rodrique on 3/19/2018.
 */
public class SamsungFactory
{
    public SamsungInterface getPhone(String phoneBrand)
    {
        if(phoneBrand == null)
        {
            return null;
        }
        if(phoneBrand.equalsIgnoreCase("Samsung S1"))
        {
            return new Samsung();
        }
        else if(phoneBrand.equalsIgnoreCase("Samsung S2"))
        {
            return new Samsung();
        }
        else if(phoneBrand.equalsIgnoreCase("Samsung S5"))
        {
            return new Samsung();
        }
        else if(phoneBrand.equalsIgnoreCase("Samsung S6"))
        {
            return new Samsung();
        }
        else if(phoneBrand.equalsIgnoreCase("Samsung S7"))
        {
            return new Samsung();
        }
        return null;
    }
}

