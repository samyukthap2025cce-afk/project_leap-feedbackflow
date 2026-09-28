package com.example.course_feedback_system.controller;

import com.example.course_feedback_system.model.FeedbackForm;
import com.example.course_feedback_system.service.FeedbackFormService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback-forms")
public class FeedbackFormController {

    private final FeedbackFormService service;

    public FeedbackFormController(FeedbackFormService service) {
        this.service = service;
    }

    @PostMapping
    public FeedbackForm create(@RequestBody FeedbackForm feedbackForm) {
        return service.createFeedbackForm(feedbackForm);
    }

    @GetMapping
    public List<FeedbackForm> getAll() {
        return service.getAllFeedbackForms();
    }

    @GetMapping("/{id}")
    public FeedbackForm getById(@PathVariable Long id) {
        return service.getFeedbackFormById(id);
    }

    @PutMapping("/{id}")
    public FeedbackForm update(@PathVariable Long id,
                               @RequestBody FeedbackForm feedbackForm) {
        return service.updateFeedbackForm(id, feedbackForm);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteFeedbackForm(id);
        return "Feedback form deleted successfully";
    }
}