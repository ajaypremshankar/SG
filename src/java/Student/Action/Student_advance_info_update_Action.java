/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student.Action;

import Global.Model.DBOperation;
import Global.Model.ObjectSerializer;
import Global.Model.ProfileInfoBundle;
import Global.Model.Student_Info;
import Global.Model.Student_Profile_Manager;
import Student.ActionForm.Student_advance_info_update_Bean;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author ajay prem shankar
 */
public class Student_advance_info_update_Action extends org.apache.struts.action.Action {

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

         Student_advance_info_update_Bean bean=(Student_advance_info_update_Bean)form;
         ProfileInfoBundle pib=(ProfileInfoBundle)request.getSession().getAttribute("user");
         Student_Info si=(Student_Info)pib.getUser_specific();
         String id=pib.getId();
         int std=bean.getStd();
         String section=bean.getSection();
         String about=bean.getAbout();
         String hobbies[]=bean.getHobbies();
         String subjects[]=bean.getSubjects();
         String career=bean.getCareer();
         
         
         if(std!=0){
         DBOperation.updateColumn(DBOperation.STUDENT_INFO, "std", ""+std, id);
         si.setStd(""+std);
         }
         
         if(!section.equals("")){
         DBOperation.updateColumn(DBOperation.STUDENT_INFO, "section", section, id);
         si.setSection(section);
         }
         
         if(!about.equals("")){
         DBOperation.updateColumn(DBOperation.STUDENT_INFO, "about", about, id);
         si.setAbout(about);
         }
         System.out.print(hobbies+""+subjects+""+career);
         if(hobbies.length>0||subjects.length>0||!career.equals("")){
        String root=getServlet().getServletContext().getRealPath("/");
        File path=new File(root+"userData/"+id);
        File file=new File(path,"profileObject.SG");
        if(file.exists()){
            
            Student_Profile_Manager spm=(Student_Profile_Manager)ObjectSerializer.Reader(id,ObjectSerializer.PROFILE, root);
            
            if(hobbies.length>0){
            ArrayList<String> hobby=spm.getHobbies();
            for(int i=0;i<hobbies.length; i++){
            int j;
            for(j=0; j<hobby.size(); j++){
            if(hobby.get(j).equalsIgnoreCase(hobbies[i])){
            break;
            }
            }
            if(j>=hobby.size()){
            hobby.add(hobbies[i]);
            }
            }
            spm.setHobbies(hobby);
            }
            
            
            if(subjects.length>0){
            ArrayList<String> subject=spm.getSubjects();
            for(int i=0;i<subjects.length; i++){
            int j;
            for(j=0; j<subject.size(); j++){
            if(subject.get(j).equalsIgnoreCase(hobbies[i])){
            break;
            }
            }
            if(j>=subject.size()){
            subject.add(subjects[i]);
            }
            }
            spm.setSubjects(subject);
            }
            
            if(!career.equals("")){
            spm.setCareer(career);
            }
            ObjectSerializer.Writer(spm, id, ObjectSerializer.PROFILE,root);
            
            
        }
        else{
            Student_Profile_Manager spm=new Student_Profile_Manager();
            if(hobbies.length>0){
            ArrayList<String> hobby=new ArrayList<String>();
            hobby.addAll(Arrays.asList(hobbies));
            spm.setHobbies(hobby);
            }
            if(subjects.length>0){
            ArrayList<String> subject=new ArrayList<String>();
            subject.addAll(Arrays.asList(subjects));
            spm.setHobbies(subject);
            }
            if(!career.equals("")){
            spm.setCareer(career);
            }
            
            ObjectSerializer.Writer(spm, id, ObjectSerializer.PROFILE,root);
            
     }
     }
         
        
        return mapping.findForward(SUCCESS);
    }
}
