package EmmaD;

/**
 * Created by rodrique on 3/12/2018.
 */
public class Client
{
    private String clientName;
    private String clientSurname;
    private Account clientAccount;

    public Client()
    {

    }

    public Client(String n, String sn, Account acc)
    {

    }

    public void setClientName(String n)
    {
        clientName = n;
    }

    public void setClientSurname(String sn)
    {
        clientSurname = sn;
    }

    public void setClientAccount(Account acc)
    {
        clientAccount = acc;
    }

    public String getClientName()
    {
        return clientName;
    }

    public String getClientSurname()
    {
        return clientSurname;
    }

    public Account getClientAccount()
    {
        return clientAccount;
    }

    public String toString()
    {
        String msg = String.format("Client Name: %s\nClient Surname: %s\n%s\n", getClientName(), getClientSurname(), getClientAccount());
        return msg;
    }
}
