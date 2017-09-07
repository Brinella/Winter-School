package utility;

/**
 * Created by rodrique on 9/6/2017.
 */
import java.util.UUID;
public class KeyGenerator
{

    public static String getEntityId() {
            return UUID.randomUUID().toString();
        }


}
