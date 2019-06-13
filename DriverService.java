package com.uhcl.com.uhcl.Service;

import com.uhcl.model.*;

import java.util.ArrayList;
import java.util.List;

public interface DriverService {
    public List<CourseHibernate> getCourses();
    public List<InstructorHibernate> getInstructors();
    public boolean SaveTeachingApproaches(TeachingApproachesHibernate teachingApproachesHibernate);
    public boolean SaveFeedbackAssesment(FeedbackAndAssessmentHibernate feedbackAndAssessmentHibernate);
    public boolean SaveResourcesAdmin(ResourcesAndAdminHibernate resourcesAndAdminHibernate);
    public boolean SaveAdditionalQuestions(AdditionalQuestionHibernate additionalQuestionHibernate);
    public boolean SaveOverallExperience(OverallExperienceHibernate overallExperienceHibernate);
    public boolean SaveStudentSelfEval(StudentSelfEvalHibernate studentSelfEvalHibernate);
    public boolean SaveCommentsOnStmp(CommentsOnStImpHibernate commentsOnStImpHibernate);
    public boolean SaveSurvey(courseInstructor courseInstructor);


}
