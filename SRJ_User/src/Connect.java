
package Connection;


import java.sql.*;
import javax.swing.JOptionPane;

public class Connect {
 public Connection conn;
    
 public Connection Connect()
  {
      try{
        String url= "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12326556";
        String user= "sql12326556";
        String pass= "Ecsx2Pwuur";
        Class.forName("com.mysql.jdbc.Driver");
        conn= DriverManager.getConnection(url,user,pass);
      }
      catch (ClassNotFoundException | SQLException e)
      {
          JOptionPane.showMessageDialog(null, e.getMessage());
      }
      return conn;
  }
    
}

