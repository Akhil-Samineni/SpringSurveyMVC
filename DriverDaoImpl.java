package com.uhcl.Dao;

import com.uhcl.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class DriverDaoImpl implements DriverDao {

    @Autowired
    private SurveyHibernate surveyHibernate;
    @Autowired
    private SessionFactory sessionFactory;
    public List<CourseHibernate> getCourses() {

        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(" from CourseHibernate");

        List<CourseHibernate> courseList= query.list();

        session.flush();
        return courseList;
    }

    public List<InstructorHibernate> getInstructors() {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createQuery(" from InstructorHibernate");

        List<InstructorHibernate> instructorHibernateList= query.list();

        session.flush();
        return instructorHibernateList;
    }

    public boolean SaveTeachingApproaches(TeachingApproachesHibernate teachingApproachesHibernate) {
        Session session=sessionFactory.getCurrentSession();
        boolean flag=false;
        try {
            System.out.println(teachingApproachesHibernate.toString());
            session.save(teachingApproachesHibernate);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
            flag=false;
        }
        session.flush();
        return flag;
    }

    public boolean SaveFeedbackAssesment(FeedbackAndAssessmentHibernate feedbackAndAssessmentHibernate) {
        Session session=sessionFactory.getCurrentSession();
        boolean flag=false;
        try {
            session.save(feedbackAndAssessmentHibernate);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
            flag=false;
        }
        session.flush();
        return flag;
    }

    public boolean SaveResourcesAdmin(ResourcesAndAdminHibernate resourcesAndAdminHibernate) {
        Session session=sessionFactory.getCurrentSession();
        boolean flag=false;
        try {
            session.save(resourcesAndAdminHibernate);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
            flag=false;
        }
        session.flush();
        return flag;
    }

    public boolean SaveAdditionalQuestions(AdditionalQuestionHibernate additionalQuestionHibernate) {
        Session session=sessionFactory.getCurrentSession();
        boolean flag=false;
        try {
            session.save(additionalQuestionHibernate);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
            flag=false;
        }
        session.flush();
        return flag;
    }

    public boolean SaveOverallExperience(OverallExperienceHibernate overallExperienceHibernate) {
        Session session=sessionFactory.getCurrentSession();
        boolean flag=false;
        try {
            session.save(overallExperienceHibernate);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
            flag=false;
        }
        session.flush();
        return flag;
    }

    public boolean SaveStudentSelfEval(StudentSelfEvalHibernate studentSelfEvalHibernate) {
        Session session=sessionFactory.getCurrentSession();
        boolean flag=false;
        try {
            session.save(studentSelfEvalHibernate);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
            flag=false;
        }
        session.flush();
        return flag;
    }

    public boolean SaveSurvey(courseInstructor courseInstructor) {
        Session session=sessionFactory.getCurrentSession();
        boolean flag=false;
        try {
            Query query;

            surveyHibernate.setUser_id(courseInstructor.getUser_id());
            surveyHibernate.setCourse_id(courseInstructor.getCourse_id());
            surveyHibernate.setInstructor_id(courseInstructor.getInstructor_id());

            query=session.createQuery("select max(ta_id) from TeachingApproachesHibernate");
            surveyHibernate.setTa_id((Integer)query.list().get(0));

            query=session.createQuery("select max(f_id) from FeedbackAndAssessmentHibernate");
            surveyHibernate.setF_id((Integer)query.list().get(0));

            query=session.createQuery("select max(a_id) from AdditionalQuestionHibernate");
            surveyHibernate.setA_id((Integer)query.list().get(0));

            query=session.createQuery("select max(co_id) from CommentsOnStImpHibernate");
            surveyHibernate.setCo_id((Integer)query.list().get(0));

            query=session.createQuery("select max(o_id) from OverallExperienceHibernate");
            surveyHibernate.setO_id((Integer)query.list().get(0));

            query=session.createQuery("select max(r_id) from ResourcesAndAdminHibernate");
            surveyHibernate.setR_id((Integer)query.list().get(0));

            query=session.createQuery("select max(ss_id) from StudentSelfEvalHibernate");
            surveyHibernate.setSs_id((Integer)query.list().get(0));

            System.out.println(surveyHibernate.toString());


            flag=true;
            SurveyMain(surveyHibernate);

        }catch (Exception e){
            e.printStackTrace();
            flag=false;
        }
        session.flush();
        return flag;
    }

    public boolean SurveyMain(SurveyHibernate surveyHibernate){
        Session session=sessionFactory.getCurrentSession();
        System.out.println("Survey hibernate "+ surveyHibernate.toString());
        boolean flag=false;
        try {
            session.save(surveyHibernate);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
            flag=false;
        }
        session.flush();
        return flag;
    }


    public boolean SaveCommentsOnStmp(CommentsOnStImpHibernate commentsOnStImpHibernate) {
        Session session=sessionFactory.getCurrentSession();
        boolean flag=false;
        try {
            session.save(commentsOnStImpHibernate);
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
            flag=false;
        }
        session.flush();
        return flag;
    }
}
