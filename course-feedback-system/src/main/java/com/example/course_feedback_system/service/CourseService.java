package com.example.course_feedback_system.service;



import com.example.course_feedback_system.model.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    Course addCourse(Course course);

    Course updateCourse(Long id, Course course);

    void deleteCourse(Long id);
}