package com.uhcl.com.uhcl.Service;

import com.uhcl.Dao.DriverDao;
import com.uhcl.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverServiceImpl implements DriverService{

    @Autowired
    private DriverDao driverDao;

    @Transactional
    public List<CourseHibernate> getCourses() {
        List<CourseHibernate> courseList= driverDao.getCourses();
        return courseList;
    }

    @Transactional
    public List<InstructorHibernate> getInstructors() {
        List<InstructorHibernate> instructorHibernateList= driverDao.getInstructors();
        return instructorHibernateList;
    }

    @Transactional
    public boolean SaveTeachingApproaches(TeachingApproachesHibernate teachingApproachesHibernate) {
        return driverDao.SaveTeachingApproaches(teachingApproachesHibernate);
    }

    @Transactional
    public boolean SaveFeedbackAssesment(FeedbackAndAssessmentHibernate feedbackAndAssessmentHibernate) {
        return driverDao.SaveFeedbackAssesment(feedbackAndAssessmentHibernate);
    }

    @Transactional
    public boolean SaveResourcesAdmin(ResourcesAndAdminHibernate resourcesAndAdminHibernate) {
        return driverDao.SaveResourcesAdmin(resourcesAndAdminHibernate);
    }

    @Transactional
    public boolean SaveAdditionalQuestions(AdditionalQuestionHibernate additionalQuestionHibernate) {
        return driverDao.SaveAdditionalQuestions(additionalQuestionHibernate);
    }

    @Transactional
    public boolean SaveOverallExperience(OverallExperienceHibernate overallExperienceHibernate) {
        return driverDao.SaveOverallExperience(overallExperienceHibernate);
    }

    @Transactional
    public boolean SaveStudentSelfEval(StudentSelfEvalHibernate studentSelfEvalHibernate) {
        return driverDao.SaveStudentSelfEval(studentSelfEvalHibernate);
    }

    @Transactional
    public boolean SaveCommentsOnStmp(CommentsOnStImpHibernate commentsOnStImpHibernate) {
        return driverDao.SaveCommentsOnStmp(commentsOnStImpHibernate);
    }

    @Transactional
    public boolean SaveSurvey(courseInstructor courseInstructor) {
        return driverDao.SaveSurvey(courseInstructor);
    }
}
