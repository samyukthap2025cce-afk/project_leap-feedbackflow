package com.example.course_feedback_system.model;

import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionText;

    @ManyToOne
    private FeedbackForm feedbackForm;

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public FeedbackForm getFeedbackForm() {
        return feedbackForm;
    }

    public void setFeedbackForm(FeedbackForm feedbackForm) {
        this.feedbackForm = feedbackForm;
    }
}