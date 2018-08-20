package Repository;

import Domain.Rental;

/**
 * Created by Emma on 8/11/2018.
 */
public interface RentalRepository extends CrudRepository<Rental, Long>
{

    Iterable<Rental> findAllById(long id);//finds all Rentals

}
