package Phone_brands;

/**
 * Created by rodrique on 3/19/2018.
 */
import java.util.ArrayList;
import java.util.List;

public class Phone_List
{
    private SamsungFactory sFactory = new SamsungFactory();
    private PhoneBuilder pBuilder = new PhoneBuilder();
    private float total = 0;
    List<String> orders = new ArrayList<String>();

    public void phonePurchase(String item)
    {
        if(item.equalsIgnoreCase("Samsung"))
        {
            SamsungInterface s1 = SamsungType.getphoneMod(item);
            orders.add(s1.getphone_brand());
            total += s1.getphonePrice();
        }
        else if(item.equalsIgnoreCase("Samsung s5"))
        {
            SamsungInterface s5 = SamsungType.getphoneMod(item);
            orders.add(s5.getphone_brand());
            total += s5.getphonePrice();
        }
        else if(item.equalsIgnoreCase("Samsung s6"))
        {
            SamsungInterface s6 = SamsungType.getphoneMod(item);
            orders.add(s6.getphone_brand());
            total += s6.getphonePrice();
        }
    }
}
