package service;

import domain.WinterSchool;

/**
 * Created by rodrique on 8/11/2017.
 */
public interface WinterSchoolService
{
    WinterSchool create(WinterSchool winterSchool);
    WinterSchool read(String subject);
    WinterSchool update(WinterSchool winterSchool);
    void delete(String subject);
}
