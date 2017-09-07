package factories;

import domain.Location;

import java.util.Map;

/**
 * Created by rodrique on 8/11/2017.
 */
public class LocationFactory
{
    public static Location getSubject(Map<String,String> values, int areaCode)
    {Location location = new Location.Builder()
            . address(values.get("Address:"))
            .areaCode(areaCode)
            .build();
        return location;
    }
}
