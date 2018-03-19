package Emma;

/**
 * Created by rodrique on 3/16/2018.
 */
public class Client
{
    private String clientName;
    private String clientSurName;
    private Account clientAccount ;

    Account account=new Account();

    public Client()
    {
    }
    public Client(String n,String sn,Account acc)
    {

    }

    public void setClientName (String nm)
    {
        clientName=nm;
    }

    public void setClientSurname (String snm)
    {
        clientSurName=snm;
    }

    public void setClientAccount (Account acc)
    {
    }

    public String getClientName()
    {
        return clientName;
    }

    public String getClientSurname()
    {
        return clientSurName;
    }

    public Account getClientAccount()
    {
        return clientAccount;
    }

    public String toString()
    { String mesg="Message";
        return mesg;
    }






}
