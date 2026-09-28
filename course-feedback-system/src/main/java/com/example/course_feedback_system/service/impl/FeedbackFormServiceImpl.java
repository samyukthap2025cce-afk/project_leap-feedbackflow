package com.example.course_feedback_system.service.impl;

import com.example.course_feedback_system.model.FeedbackForm;
import com.example.course_feedback_system.repository.FeedbackFormRepository;
import com.example.course_feedback_system.service.FeedbackFormService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackFormServiceImpl implements FeedbackFormService {

    private final FeedbackFormRepository repository;

    public FeedbackFormServiceImpl(FeedbackFormRepository repository) {
        this.repository = repository;
    }

    @Override
    public FeedbackForm createFeedbackForm(FeedbackForm feedbackForm) {
        return repository.save(feedbackForm);
    }

    @Override
    public List<FeedbackForm> getAllFeedbackForms() {
        return repository.findAll();
    }

    @Override
    public FeedbackForm getFeedbackFormById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public FeedbackForm updateFeedbackForm(Long id, FeedbackForm feedbackForm) {
        FeedbackForm existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setFormName(feedbackForm.getFormName());
            existing.setCourse(feedbackForm.getCourse());

            return repository.save(existing);
        }

        return null;
    }

    @Override
    public void deleteFeedbackForm(Long id) {
        repository.deleteById(id);
    }
}