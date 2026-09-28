package com.example.course_feedback_system.repository;

import com.example.course_feedback_system.model.FeedbackForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackFormRepository extends JpaRepository<FeedbackForm, Long> {
}