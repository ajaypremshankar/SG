/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Global.Model;

import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author ajay prem shankar
 */
public class DBOperation {
    private static  Connection con;
	private static PreparedStatement psmt;
	private static ResultSet rs;
    private static Statement st;


    //Tables in DB
    public static String USER_BASIC="user_basic";
    public static String USER_LOGIN="user_login";
    public static String PARENT_INFO="parent_info";
    public static String TEACHER_INFO="teacher_info";
    public static String STUDENT_INFO="student_info";

    static {
    con=DBConnection.getConn();
    }

    public static int DBUpdate(String query){
	int m;
	try{
        con=DBConnection.getConn();
		st=con.createStatement();
		m=st.executeUpdate(query);
        con.close();
		return m;
	}catch(SQLException e){
        System.out.println(e);
		return 0;
	}
	}
public static int DBUpdateMedia(String query){
int m;
try{
psmt=con.prepareStatement(query);
m=psmt.executeUpdate();
return m;
}
catch(SQLException e){
return 0;
}
}


// To perform Select query on DB
public static ResultSet getRecord(String query){
	try{
        con=DBConnection.getConn();
        st=con.createStatement();
        rs=st.executeQuery(query);
        return rs;
	}catch(Exception e){
            System.out.print("SQL EXCEPTION: "+e);
		rs=null;
	}
		return rs;
}


//works only with varchar
//to update values of given column of given table with given value for given id :P
public static int updateColumn(String table, String column, String value, String id){
String query="update "+table+" set "+column+"='"+value+"' where global_id='"+id+"'";
return DBUpdate(query);
}

}