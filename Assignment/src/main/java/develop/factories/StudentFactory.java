package factories;

import domain.Student;

import java.util.Map;

/**
 * Created by rodrique on 8/11/2017.
 */
public class StudentFactory
{
    public static Student getStudent(Map<String,String> values, int studNo)
    {Student student = new Student.Builder()
            .studNo(studNo)
            .studName(values.get("Student Name:"))
            .build();
        return student;
    }
}
