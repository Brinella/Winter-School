package Phone_brands;

/**
 * Created by rodrique on 3/19/2018.
 */
public class PhoneBuilder
{
    public PhoneInterface phoneInfo()
    {
        PhoneInterface samPhone = (PhoneInterface) new Samsung();
        return samPhone;

    }
}
