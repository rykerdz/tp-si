/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;
import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
   public Connection connect() throws ClassNotFoundException {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String MySQLURL = "jdbc:mysql://localhost:3306/projetsi";
      String databseUserName = "root";
      String databasePassword = "rykerdz2809";
      Connection con = null;
      try {
         con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
         if (con != null) {
            System.out.println("Database connection is successful !!!!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      return con;
   }
}
/**
 *
 * @author Youcef
 */

