package com.example.course_feedback_system.service;

import com.example.course_feedback_system.model.FeedbackForm;

import java.util.List;

public interface FeedbackFormService {

    FeedbackForm createFeedbackForm(FeedbackForm feedbackForm);

    List<FeedbackForm> getAllFeedbackForms();

    FeedbackForm getFeedbackFormById(Long id);

    FeedbackForm updateFeedbackForm(Long id, FeedbackForm feedbackForm);

    void deleteFeedbackForm(Long id);
}