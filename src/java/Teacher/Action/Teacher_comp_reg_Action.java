/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Teacher.Action;

import Global.Model.DBConnection;
import Global.Model.DBOperation;
import Global.Model.ProfileInfoBundle;
import Global.Model.Teacher_Info;
import Teacher.ActionForm.Teacher_comp_reg_Bean;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author ajay prem shankar
 */
public class Teacher_comp_reg_Action extends org.apache.struts.action.Action {



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
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        Teacher_comp_reg_Bean bean=(Teacher_comp_reg_Bean) form;
        HttpSession ses=request.getSession(false);
        
        ProfileInfoBundle pib=(ProfileInfoBundle)ses.getAttribute("user");
        String id=pib.getId();
        String experience=bean.getExperience();
        String subjects=bean.getSubjects();
        String about=bean.getAbout();
        String education=bean.getEducation();
        String city=bean.getCity();
        String state=bean.getState();
        String filepath="";
        String filename="";


        FormFile file=bean.getFile();
        if(!file.getFileName().equals("")||file.getFileName()!=null){
        filepath=getServlet().getServletContext().getRealPath("/")+"userData"+File.separator+id+File.separator;

        File folder=new File(filepath);
        if(!folder.exists()){
        folder.mkdirs();
        }
        String ext=file.getFileName().substring(file.getFileName().lastIndexOf("."),file.getFileName().length());

        filename="profile_pic"+ext;

        File newFile=new File(filepath, filename);

        FileOutputStream fos=new FileOutputStream(newFile);

        fos.write(file.getFileData());
        fos.flush();
        fos.close();
        }



        String query="insert into teacher_info values('"+id+"','"+experience+"','"+about+"','"+
                education+"','"+subjects+"')";
        DBOperation.DBUpdate(query);
        
        Teacher_Info ti=new Teacher_Info();
        ti.setEducation(education);
        ti.setAbout(about);
        ti.setExperience(experience);
        pib.setUser_specific(ti);
        //updating city and state
        DBOperation.updateColumn(DBOperation.USER_BASIC,"city",city, id);
        pib.setCity(city);
        
        DBOperation.updateColumn(DBOperation.USER_BASIC,"state",state, id);
        pib.setState(state);
        
        //updating profile_pic path in DB
        if(!filepath.equals("")){
        PreparedStatement ps=DBConnection.getConn().prepareStatement("update user_basic set pic=? where global_id=?");
        ps.setString(1,filepath+filename);
        ps.setString(2, id);
        ps.executeUpdate();
        
        ps.close();
        pib.setPic_path(filepath+filename);
        }
        
        
        request.getSession().setAttribute("user", pib);
        return mapping.findForward(SUCCESS);


    }
}
