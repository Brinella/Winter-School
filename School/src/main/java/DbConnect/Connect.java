package develop.DbConnect;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.swing.*;
import javax.swing.*;
/**
 * Created by rodrique on 10/09/2017.
 */
public class Connect
{
    private static Context initCtx;

    static {
        try {
            initCtx = new InitialContext();
        }//end try
        catch (NamingException ex)
        {
            ex.printStackTrace();
        }
            }//end static

    public static Connection getMySQLConnection()//getMySQLConnection made up word
    {
        Connection conct = null;
         try {
               DataSource ds = (DataSource) initCtx.lookup("");
               conct = ds.getConnection();
             }
         catch (SQLException | NamingException  ce)
         {
             JOptionPane.showMessageDialog( null,"Error, Cannot connect to database");
             ce.printStackTrace();
         }
         return conct;
         }
}
