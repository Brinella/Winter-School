package factories;
import domain.MainCourse;
import java.util.Map;
/**
 * Created by rodrique on 4/20/2018.
 */
public class MainCourseFactory
{
    public static MainCourse getMainCourse(Map<String,String> values)// , List<Chef> chefs)
    {
        MainCourse mainCourse = new MainCourse
                .Builder()
                .mainID(values.get("main ID"))
                .foodItem(values.get("food Item"))


                .build();
        return mainCourse;
    }
}
