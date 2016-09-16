/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Global.Action;

import Global.ActionForm.Login_Action_Bean;
import Global.Model.DBOperation;
import Global.Model.LoginAuthenticator;
import Global.Model.ProfileInfoBundle;
import java.sql.ResultSet;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

/**
 *
 * @author ajay prem shankar
 */
public class Login_Action_Action extends org.apache.struts.action.Action {
    
    /* forward name="success" path="" */
    private final static String SUCCESS = "success";
    
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        Login_Action_Bean bean=(Login_Action_Bean)form;
        boolean remember_me=bean.getRemember_me();
        String id;
        String query="select global_id from user_id_gen where id='"+bean.getEmail()+"'";
        ResultSet rs=DBOperation.getRecord(query);
        if(rs.next()){
        id=""+rs.getInt("global_id");
        System.out.print("ID"+id);
        }
        else{
        
        request.getSession().setAttribute("Exception","Username or Password");
        return mapping.getInputForward();
        }
        ProfileInfoBundle pib=LoginAuthenticator.Authenticate(id,bean.getPassword());
        if(pib==null){
        request.getSession().setAttribute("Exception","Wrong Username or Password");
        return mapping.getInputForward();
        }
        request.getSession().setAttribute("user",pib);
        System.out.println(bean.getEmail());
        if(!LoginAuthenticator.isRegistrationComplete(id,pib.getUser_type().toLowerCase())){
        return mapping.findForward(pib.getUser_type().toLowerCase());
        }
        else{
        return mapping.findForward("home_"+pib.getUser_type().toLowerCase());
        }
        }
}
