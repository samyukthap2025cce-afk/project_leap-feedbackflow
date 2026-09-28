package com.example.course_feedback_system.repository;

import com.example.course_feedback_system.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<Response, Long> {
}