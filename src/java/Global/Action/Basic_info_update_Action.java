/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Global.Action;

import Global.ActionForm.Basic_info_update_Bean;
import Global.Model.DBOperation;
import Global.Model.ObjectSerializer;
import Global.Model.ProfileInfoBundle;
import Global.Model.Student_Profile_Manager;
import java.io.File;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author ajay prem shankar
 */
public class Basic_info_update_Action extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
     static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
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
     
     ProfileInfoBundle pib=(ProfileInfoBundle)request.getSession().getAttribute("user");
     String id=pib.getId();
     Basic_info_update_Bean bean=(Basic_info_update_Bean)form;
     String fname=bean.getFname();
     String lname=bean.getLname();
     int day=bean.getDay();
     String month=bean.getMonth();
     int year=bean.getYear();
     long mob=bean.getMob();
     String city=bean.getCity();
     String state=bean.getState();
     String country=bean.getCountry();
     String add_email=bean.getAdd_email();
     String address=bean.getAddress();
     String table="user_basic";
     
     
     if(!fname.equals("")){
     DBOperation.updateColumn(table,"fname", fname,id);
     pib.setFname(fname);
     }
     
     if(!lname.equals("")){
     DBOperation.updateColumn(table,"lname", lname,id);
     pib.setLname(lname);
     }
     
     if(!month.equals("Month")&&day!=0&&year!=0){
     DBOperation.updateColumn(table,"dob",""+day+"."+month+"."+year,id);
     pib.setDob(""+day+"."+month+"."+year);
     }
     
     if(mob!=0){
     DBOperation.updateColumn(table,"mob", ""+mob,id);
     pib.setMob(""+mob);
     }
      
     if(!city.equals("")){
     DBOperation.updateColumn(table,"city", city,id);
     pib.setCity(city);
     }
     
     if(!state.equals("")){
     DBOperation.updateColumn(table,"state", state,id);
     pib.setState(state);
     }
     
     if(!country.equals("")){
     DBOperation.updateColumn(table,"country", country,id);
     pib.setCountry(country);
     }
     
     if(!address.equals("")){
     DBOperation.updateColumn(table,"address", address,id);
     pib.setAddress(address);
     }
     
     if(!add_email.equals("")){
     if(pib.getUser_type().equalsIgnoreCase("student")){
        String root=getServlet().getServletContext().getRealPath("/");
        File path=new File(root+"userData/"+id);
        File file=new File(path,"profileObject.SG");
        if(file.exists()){
            
            Student_Profile_Manager spm=(Student_Profile_Manager)ObjectSerializer.Reader(id,ObjectSerializer.PROFILE, root);
            ArrayList<String> emails=spm.getAdd_email();
            if(!emails.contains(add_email))
            {
                emails.add(add_email);
            }
            spm.setAdd_email(emails);
            ObjectSerializer.Writer(spm, id, ObjectSerializer.PROFILE,root);
        }
        else{
            System.out.println("File Does not Exist");
            Student_Profile_Manager spm=new Student_Profile_Manager();
            ArrayList<String> emails=new ArrayList<String>();
            emails.add(add_email);
            spm.setAdd_email(emails);
            System.out.print(ObjectSerializer.Writer(spm, id, ObjectSerializer.PROFILE,root));
            
        }
     }
     }
     
     request.getSession().setAttribute("user",pib);
        return mapping.findForward(pib.getUser_type().toLowerCase()+"_"+SUCCESS);
    }
}
