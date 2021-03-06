package Services;

import Domain.Rental;
/**
 * Created by Emma on 8/12/2018.
 */
public interface RentalServices
{

    Rental create(Rental rent);
    Rental read(long id);
    Rental update(Rental rent);
    void delete(long id);
    Iterable<Rental> readAll();
    Iterable<Rental> findAllById(long id);//single search

}
