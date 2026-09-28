package com.example.course_feedback_system.service.impl;


import com.example.course_feedback_system.model.Course;
import com.example.course_feedback_system.repository.CourseRepository;
import com.example.course_feedback_system.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Long id, Course course) {

        Course existingCourse =
                courseRepository.findById(id).orElse(null);

        if (existingCourse != null) {
            existingCourse.setCourseName(course.getCourseName());


            return courseRepository.save(existingCourse);
        }

        return null;
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}