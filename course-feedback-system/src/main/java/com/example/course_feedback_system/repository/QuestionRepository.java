package com.example.course_feedback_system.repository;

import com.example.course_feedback_system.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}