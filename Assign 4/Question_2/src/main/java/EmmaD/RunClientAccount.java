package EmmaD;
import java.util.*;
import javax.swing.*;
/**
 * Created by rodrique on 3/12/2018.
 */
public class RunClientAccount
{
    public static void main(String[] args) {
    
    Client fnbClient = new Client();
        
    Account fnbAccount = new Account();

    String name = JOptionPane.showInputDialog("***_Enter Client name:_*** ");
        
    fnbClient.setClientName(name);
        
    String sName = JOptionPane.showInputDialog("***_Enter Client surname:_*** ");
        
    fnbClient.setClientSurname(sName);
        
    String num = JOptionPane.showInputDialog("***_Enter Account Number:_*** ");
        
    int accNum = Integer.parseInt(num);
    
    fnbAccount.setAccountNumber(accNum);

    String type = JOptionPane.showInputDialog("***_Enter Account Type:_*** ");
        
    fnbAccount.setAccountType(type);
        
    String bal = JOptionPane.showInputDialog("***_Enter Account Balance: R_***");
        
    int accBal = Integer.parseInt(bal);
        
    fnbAccount.setAccountBalance(accBal);
        
    String deposit = JOptionPane.showInputDialog("***_Enter amount to deposit: R_***");
        
    int dep = Integer.parseInt(deposit);
        
    fnbAccount.deposit(dep);
        if(accBal > 0)
        {
            String withraw = JOptionPane.showInputDialog("***_Enter amount to withdraw: R_***");
            int wDraw = Integer.parseInt(withraw);
            fnbAccount.withdraw(wDraw);
        }
        
   fnbClient.setClientAccount(fnbAccount);
       
   JOptionPane.showMessageDialog(null, fnbClient.toString());
    }
}
