package Phone_brands;

/**
 * Created by rodrique on 3/19/2018.
 */
public class SamsungType {
    private static SamsungInterface samsungS5 = new Samsung();
    private static SamsungInterface samsungS7 = new Samsung();
    private static SamsungInterface samsungS6 = new Samsung();

    private SamsungType() {
    }

    public static SamsungInterface getphoneMod(String phoneModule) {
        if (phoneModule == null) {
            return null;
        }
        if (phoneModule.equalsIgnoreCase("Samsung s6")) {
            return samsungS5;
        } else if (phoneModule.equalsIgnoreCase("Samsung s7")) {
            return samsungS7;
        }

        return null;
    }
}
