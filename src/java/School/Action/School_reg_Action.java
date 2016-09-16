/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package School.Action;

import School.ActionForm.School_reg_Bean;
import School.Model.School_Login;
import School.Model.School_Reg_Profile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ajay prem shankar
 */
public class School_reg_Action extends org.apache.struts.action.Action {
    
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

        School_reg_Bean bean=(School_reg_Bean) form;
        
        if(!bean.getPassword().equals(bean.getConfirm_password())){
        request.getSession().setAttribute("error", "Password Mismatch");

        return mapping.getInputForward();
        }
        
        School_Login login=new School_Login();
        login.setEmail(bean.getSchool_email());
        login.setPassword(bean.getPassword());
        
        Configuration cfg=new Configuration().configure();
        
        SessionFactory sesFac=cfg.buildSessionFactory();
        Session ses=sesFac.openSession();
        ses.beginTransaction();
        ses.save(login);
        ses.getTransaction().commit();
        
        
        School_Reg_Profile prf=new School_Reg_Profile();
        
        prf.setSchool_name(bean.getSchool_name());
        prf.setSchool_email(bean.getSchool_email());
        prf.setBoard(bean.getBoard());
        prf.setCity(bean.getCity());
        prf.setEstb_year(bean.getEstb_year());
        prf.setRegistered_under(bean.getRegistered_under());
        prf.setWebsite(bean.getWebsite());
        prf.setSchool_type(bean.getSchool_type());
        prf.setState(bean.getState());
        prf.setSchool_phone(bean.getSchool_phone());
        
        request.getSession().setAttribute("School_Reg", prf);

        return mapping.findForward(SUCCESS);
    }
}
