/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Global.Action;

import Global.ActionForm.Registration_Bean;
import Global.Model.DBOperation;
import Global.Model.ProfileBundler;
import java.io.File;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author ajay prem shankar
 */
public class Registration_Action extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
     final static String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

     Global.ActionForm.Registration_Bean bean=(Registration_Bean)form;

     String user_type=bean.getUser_type();
     String email=bean.getEmail();
     String fname=bean.getFname();
     String lname=bean.getLname();
     String dob=bean.getDob();
     String school_name=bean.getSchool_name();
     String password=bean.getPassword();
     String confirm_password=bean.getConfirm_password();
     String mob=bean.getMob();
     String sex=bean.getSex();
     if(!password.equals(confirm_password)){
        ((HttpSession)request.getSession()).setAttribute("Exception", "Password didn't matched...");
        throw new java.sql.SQLException();

     }

     String query="insert into user_id_gen (id) values ('"+email+"')";
     if(DBOperation.DBUpdate(query)<1){
     ((HttpSession)request.getSession()).setAttribute("Exception", "Id already exists...");
        return mapping.getInputForward();
     }
     
     query="select global_id from user_id_gen where id='"+email+"'";
     ResultSet rs=DBOperation.getRecord(query);
     rs.next();
     String id=""+rs.getInt("global_id");

     query="insert into user_login values('"+id+"','"+password+"','"+user_type+"')";
     int i=DBOperation.DBUpdate(query);
     if(i<1){
        ((HttpSession)request.getSession()).setAttribute("Exception", "Id already exists...");
        return mapping.getInputForward();
     }
     query="insert into user_basic values('"+id+"','"+fname+"','"+lname+"','"+dob+"','"+mob+"','no address yet','"+
             null+"','"+null+"','india','"+sex+"','"+school_name+"','"+null+"')";

        DBOperation.DBUpdate(query);
        ((HttpSession)request.getSession()).setAttribute("user",ProfileBundler.bundle(id, user_type));

        
        return mapping.findForward(user_type.toLowerCase());
    }
}
