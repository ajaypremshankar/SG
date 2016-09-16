/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Global.Model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ajay prem shankar
 */
public class LoginAuthenticator {

    static ResultSet rs;
private static  String query="select * from ";

public static ProfileInfoBundle Authenticate(String id, String password){
         rs=DBOperation.getRecord("select * from user_login where global_id='"+id+"'");
        try {
            if(rs.next()) {
            if(rs.getString("password").equals(password)) {
                    return ProfileBundler.bundle(id,rs.getString("type"));
                }
            else{
            return null;
            }
            }
            } catch (SQLException ex) {
            return null;
            }
    return null;
}

public static boolean  userFinder(String user){
ResultSet rs=DBOperation.getRecord(query+"user_login"+" where global_id='"+user+"'");
    try {
        if(rs.next()){
        return true;
        }
        }
     catch (Exception e) {
        return false;
    }
return false;
}

public static boolean isRegistrationComplete(String id,String user_type){
        try {
            query = "select * from " + user_type + "_info where global_id='" + id + "'";
            rs = DBOperation.getRecord(query);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginAuthenticator.class.getName()).log(Level.SEVERE, null, ex);
        }
return false;
}

}
