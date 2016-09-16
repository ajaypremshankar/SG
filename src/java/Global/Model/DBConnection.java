/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Global.Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ajay prem shankar
 */
public class DBConnection {
	private static Connection con;
    static String url="jdbc:mysql://localhost:3306/improved";
	static String username="root";
	static String password="root";


public static Connection getConn(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,username,password);
        return con;
	}catch(Exception e){
		e.printStackTrace();
	}

    return con;
}
}
