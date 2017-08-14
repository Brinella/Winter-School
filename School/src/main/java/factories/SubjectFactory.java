package factories;

import domain.Subject;


import java.util.Map;
/**
 * Created by rodrique on 8/11/2017.
 */
public class SubjectFactory
{
    public static Subject getSubject(Map<String,String> values, int studNo)
    {Subject subject1 = new Subject.Builder()
            .subjectName(values.get("Subject Name:"))
            .studNo(studNo)
            .studName(values.get("Student Name:"))
            .lectName(values.get("Lecturer Name: "))
            .build();
        return subject1;
    }
}
