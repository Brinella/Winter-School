package Services;

import Domain.Account;

/**
 * Created by Emma on 8/12/2018.
 */
public interface AccountServices
{
    Account create(Account acc);
    Account read(long id);
    Account update(Account acc);
    void delete(long accNo);
    Iterable<Account> findAll();//findall
}
