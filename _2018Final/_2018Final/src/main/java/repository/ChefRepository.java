package repository;

import domain.Chef;
/**
 * Created by rodrique on 4/23/2018.
 */
//@Repository
public interface ChefRepository
        {
            Chef create(Chef chef);

            Chef read(String id);

            Chef update(Chef chef);

            void delete(String id);


        }

