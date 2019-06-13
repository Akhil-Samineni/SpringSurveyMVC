package com.uhcl.controller;

import com.uhcl.Dao.LoginDaoImpl;
import com.uhcl.Dao.LoginHibernateDaoImpl;
import com.uhcl.com.uhcl.Service.DriverService;
import com.uhcl.com.uhcl.Service.LoginHibernateService;
import com.uhcl.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private LoginClass login;

    @Autowired
    private LoginDaoImpl loginDao;

    @Autowired
    private LoginHibernateService loginHibernateService;

    @Autowired
    private CourseHibernate courseHibernate;

    @Autowired
    private DriverService driverService;

    @Autowired
    private TeachingApproachesHibernate teachingApproachesHibernate;

    @Autowired
    private FeedbackAndAssessmentHibernate feedbackAndAssessmentHibernate;

    @Autowired
    private ResourcesAndAdminHibernate resourcesAndAdminHibernate;

    @Autowired
    private AdditionalQuestionHibernate additionalQuestionHibernate;

    @Autowired
    private OverallExperienceHibernate overallExperienceHibernate;

    @Autowired
    private StudentSelfEvalHibernate studentSelfEvalHibernate;

    @Autowired
    private CommentsOnStImpHibernate commentsOnStImpHibernate;

    @Autowired
    private InstructorHibernate instructorHibernate;

    @Autowired
    private LoginHibernate loginHibernate;

    @Autowired
    private courseInstructor courseInstructor;

    @RequestMapping("/")
    public String home(Model model)
    {
        model.addAttribute("login", login);
        return "home";
    }

    @RequestMapping("/course")
    public String course(Model model)
    {

        model.addAttribute("courseInstructor", courseInstructor);
        List<CourseHibernate> courseHibernateList = driverService.getCourses();
        System.out.println("########### Printing Courses ##########");
        for (CourseHibernate c: courseHibernateList){
            System.out.println("Coursers are " + c.getCourseTitle());
        }

        model.addAttribute("courseList",courseHibernateList);
        System.out.println("########### End of Printing Courses ##########");



        List<InstructorHibernate> instructorHibernateList = driverService.getInstructors();
        System.out.println("########### Printing instructors ##########");
        for (InstructorHibernate c: instructorHibernateList){
            System.out.println("instructors are " + c.getTitle());
        }

        model.addAttribute("instructorList",instructorHibernateList);
        System.out.println("########### End of Printing Courses ##########");

        model.addAttribute("taApproaches", teachingApproachesHibernate);

        ArrayList<String> radioList= radiolist();

        model.addAttribute("radioList",radioList);

        ArrayList<String> yesNoList= yesNoList();

        model.addAttribute("yesNoList",yesNoList);
        return "sucess";
    }

    @RequestMapping("/faculty")
    public String facultyPg(Model model){
        List<CourseHibernate> courseList= driverService.getCourses();
        model.addAttribute("courseList",courseList);
        return "facultyPg";

    }
    @RequestMapping("/login")
    public String login(@ModelAttribute LoginClass login,Model model)
    {
        String name="home";
        System.out.println("Login id is" + login.getUsername());
        try {
            /*loginDao.connect();
            int count=loginDao.checkLogin(login);
            System.out.println("Count is " + count);
            */
        System.out.println("#########Hibernate Testing########");

        LoginHibernate loginHibernate1= loginHibernateService.findEmployeeById(login);

        System.out.println("Login details are  " + loginHibernate1.toString());
        if(loginHibernate1!=null &&(loginHibernate1.getUser_id() == login.getUsername()) && (loginHibernate1.getPass().equalsIgnoreCase(login.getPassword()))
        && (loginHibernate1.getGroupName().equalsIgnoreCase(login.getGroup()))
        ){
            if(login.getGroup().equalsIgnoreCase("Student")){
                name= "redirect:/course";
            }else{
                name= "redirect:/faculty";
            }
        }else{
            name= "redirect:/";
        }

        System.out.println("#########Hibernate Testing End########");
        loginHibernate.setUserName( Integer.toString(login.getUsername()));
        }catch (Exception e){

            e.printStackTrace();
        }
        return name;
    }

    @RequestMapping("/courseSubmit")
    public String courseSubmit(@ModelAttribute courseInstructor courseInstructor1,
                               @ModelAttribute
                                           TeachingApproachesHibernate teachingApproachesHibernate
                               ){
        System.out.println("course and instructor selected is " +courseInstructor1.toString() );


        System.out.println("######### Start of Submitted survey ##############");
        System.out.println("Teaching approaches data is " + teachingApproachesHibernate.toString() );
        System.out.println("######### End of Submitted survey ##############");

        driverService.SaveTeachingApproaches(teachingApproachesHibernate);
        courseInstructor=courseInstructor1;
        return "redirect:/FAForm";

    }

    @RequestMapping(value = "/FAForm")
        public String FAForm(Model model){
        model.addAttribute("feedbackAssesment",feedbackAndAssessmentHibernate);

        ArrayList<String> radioList= radiolist();

        model.addAttribute("radioList",radioList);

        List<String> yesNoList=yesNoList();

        model.addAttribute("yesNoList",yesNoList);
        return "FAForm";
    }

    @RequestMapping(value = "/FASubmitted")
    public String FASubmit(@ModelAttribute FeedbackAndAssessmentHibernate feedbackAndAssessmentHibernate){
        System.out.println("######### Start of Submitted survey ##############");
        System.out.println("Feedback and Assessment approaches data is " + feedbackAndAssessmentHibernate.toString() );
        System.out.println("######### End of Submitted survey ##############");
        driverService.SaveFeedbackAssesment(feedbackAndAssessmentHibernate);
        return "redirect:/RAForm";
    }

    @RequestMapping(value = "/RAForm")
    public String RAForm(Model model){
        model.addAttribute("resourceAndAdmin",resourcesAndAdminHibernate);

        ArrayList<String> radioList= radiolist();

        model.addAttribute("radioList",radioList);

        List<String> yesNoList=yesNoList();

        model.addAttribute("yesNoList",yesNoList);
        return "RAForm";
    }

    @RequestMapping(value = "/RASubmitted")
    public String RASubmit(@ModelAttribute ResourcesAndAdminHibernate resourcesAndAdminHibernate){
        System.out.println("######### Start of Submitted survey ##############");
        System.out.println("Resources and admin data is " + resourcesAndAdminHibernate.toString() );
        System.out.println("######### End of Submitted survey ##############");
        driverService.SaveResourcesAdmin(resourcesAndAdminHibernate);
        return "redirect:/AQForm";
    }

    @RequestMapping(value = "/AQForm")
    public String AQForm(Model model){
        model.addAttribute("Additional",additionalQuestionHibernate);
        ArrayList<String> radioList= radiolist();

        model.addAttribute("radioList",radioList);

        List<String> yesNoList=yesNoList();

        model.addAttribute("yesNoList",yesNoList);
        return "AQForm";
    }

    @RequestMapping(value = "/AQSubmitted")
    public String AQSubmit(@ModelAttribute AdditionalQuestionHibernate additionalQuestionHibernate){
        System.out.println("######### Start of Submitted survey ##############");
        System.out.println("Additional questions data is " + additionalQuestionHibernate.toString() );
        System.out.println("######### End of Submitted survey ##############");
        driverService.SaveAdditionalQuestions(additionalQuestionHibernate);
        return "redirect:/OEForm";
    }

    @RequestMapping(value = "/OEForm")
    public String OEForm(Model model){
        model.addAttribute("OverallExp",overallExperienceHibernate);
        ArrayList<String> radioList= OElist();

        model.addAttribute("radioList",radioList);

        List<String> yesNoList=yesNoList();

        model.addAttribute("yesNoList",yesNoList);
        return "OEForm";
    }

    @RequestMapping(value = "/OESubmitted")
    public String OESubmit(@ModelAttribute OverallExperienceHibernate overallExperienceHibernate){
        System.out.println("######### Start of Submitted survey ##############");
        System.out.println("Overall Experience data is " + overallExperienceHibernate.toString() );
        System.out.println("######### End of Submitted survey ##############");
        driverService.SaveOverallExperience(overallExperienceHibernate);
        return "redirect:/SSEForm";
    }

    @RequestMapping(value = "/SSEForm")
    public String SSEForm(Model model){
        model.addAttribute("SseForm",studentSelfEvalHibernate);
        ArrayList<String> radioList= radiolist();

        model.addAttribute("radioList",radioList);

        List<String> yesNoList=yesNoList();

        model.addAttribute("yesNoList",yesNoList);
        return "SSEForm";
    }

    @RequestMapping(value = "/SSEFSubmitted")
    public String SSESubmit(@ModelAttribute StudentSelfEvalHibernate studentSelfEvalHibernate){
        System.out.println("######### Start of Submitted survey ##############");
        System.out.println("Overall Experience data is " + studentSelfEvalHibernate.toString() );
        System.out.println("######### End of Submitted survey ##############");
        driverService.SaveStudentSelfEval(studentSelfEvalHibernate);
        return "redirect:/CStimp";
    }

    @RequestMapping(value = "/CStimp")
    public String CStimpForm(Model model){
        model.addAttribute("CStimp",commentsOnStImpHibernate);
        ArrayList<String> radioList= radiolist();

        model.addAttribute("radioList",radioList);

        List<String> yesNoList=yesNoList();

        model.addAttribute("yesNoList",yesNoList);
        return "CSTForm";
    }

    @RequestMapping(value = "/CSTFormSubmitted")
    public String CSTFormSubmit(@ModelAttribute CommentsOnStImpHibernate commentsOnStImpHibernate){
        System.out.println("######### Start of Submitted survey ##############");
        System.out.println("Comments on strengths data is " + commentsOnStImpHibernate.toString() );
        System.out.println("######### End of Submitted survey ##############");

        System.out.println("course selected is " +courseHibernate.toString() );
        System.out.println("instructor selected is " +instructorHibernate.toString() );
        driverService.SaveCommentsOnStmp(commentsOnStImpHibernate);

        return "redirect:/preview";
    }
    @RequestMapping("/preview")
    public String preview(){
        courseInstructor.setUser_id(Integer.parseInt(loginHibernate.getUserName()));
        driverService.SaveSurvey(courseInstructor);
        return "preview";
    }

    public ArrayList<String> radiolist(){
        ArrayList<String> radioList= new ArrayList<String>();
        radioList.add("SA");
        radioList.add("AG");
        radioList.add("NE");
        radioList.add("DA");
        radioList.add("SD");
        return radioList;

    }

    public ArrayList<String> OElist(){
        ArrayList<String> radioList= new ArrayList<String>();
        radioList.add("E");
        radioList.add("VG");
        radioList.add("G");
        radioList.add("F");
        radioList.add("P");
        return radioList;

    }

    public ArrayList<String> yesNoList(){
        ArrayList<String> yesNoList= new ArrayList<String>();
        yesNoList.add("YES");
        yesNoList.add("NO");
        return yesNoList;

    }

}
