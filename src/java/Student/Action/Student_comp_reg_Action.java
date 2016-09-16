/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Student.Action;

import Global.Model.DBConnection;
import Global.Model.DBOperation;
import Global.Model.ProfileInfoBundle;
import Global.Model.Student_Info;
import Student.ActionForm.Student_comp_reg_Bean;
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
public class Student_comp_reg_Action extends org.apache.struts.action.Action {
    
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

        Student_comp_reg_Bean bean=(Student_comp_reg_Bean) form;
        HttpSession ses=request.getSession(false);

        ProfileInfoBundle pib=((ProfileInfoBundle)ses.getAttribute("user"));
        String id=pib.getId();
        String std=bean.getStd();
        String section=bean.getSection();
        String about=bean.getAbout();
        String parent_id=bean.getParent_id();
        String city=bean.getCity();
        String state=bean.getState();
        String filepath="";
        String filename="";

        FormFile file=bean.getFile();
        if(!file.getFileName().equals("")&&file!=null){
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


        String query="insert into student_info values('"+id+"','"+std+"','"+section+"','"+
                about+"','"+parent_id+"')";
        Student_Info si=new Student_Info();
        si.setStd(std);
        si.setSection(section);
        si.setAbout(about);
        si.setParent_id(parent_id);
        
        pib.setUser_specific(si);
        
        DBOperation.DBUpdate(query);
        
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
        }
        request.getSession().setAttribute("user",pib);
        return mapping.findForward(SUCCESS);
    }
}
