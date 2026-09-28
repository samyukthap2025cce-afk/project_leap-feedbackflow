package com.example.course_feedback_system.repository;

import com.example.course_feedback_system.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}