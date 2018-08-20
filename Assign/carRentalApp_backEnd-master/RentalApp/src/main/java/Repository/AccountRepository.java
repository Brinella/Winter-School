package Repository;

import Domain.Account;

/**
 * Created by Emma on 8/11/2018.
 */
public interface AccountRepository extends CrudRepository <Account, Long>
{
   Account create(Account acc);
    Account read(long id);
    Account update(Account acc);
    void delete(long id);
    Iterable<Account> readAll();
}
