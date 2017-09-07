package factories;

import domain.Lecturer;


import java.util.Map;

/**
 * Created by rodrique on 8/11/2017.
 */
public class LecturerFactory
{
    public static Lecturer getStudent(Map<String,String> values, int empNo)
    {Lecturer lecturer = new Lecturer.Builder()
            .empNo(empNo)
            .lectName(values.get("Lecturer Name:"))
            .build();
        return lecturer;
    }
}
