package Emma;

/**
 * Created by rodrique on 3/16/2018.
 */
public class Account
{
    private int accNumber;
    private String accountType;
    private double accountBalance;

    Client client=new Client();

    public Account()
    {
    }

    public Account (int num , String type, double bal)
    {

    }

    public void setAccountNumber(int num)
    {accNumber=num;
    }

    public void setAccountType(String type)
    {accountType=type;
    }

    public void setAccountBalance(double bal)
    {accountBalance=bal;
    }

    public int getAccountNumber ()
    {
        return accNumber;
    }

    public String getAccountType()
    {
        return accountType;
    }

    public double getAccountbalance()
    {
        return accountBalance;
    }

    public void withdraw(double amt)
    {
        //setAccountBalance();
    }

    public void deposit(double amt)
    {setAccountBalance(amt);
    }

    public String toString()
    {   String mesg="H";
        return mesg;
    }


}
