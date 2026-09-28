package com.example.course_feedback_system.controller;

import com.example.course_feedback_system.model.Course;
import com.example.course_feedback_system.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // POST - Add Course
    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    // GET - Get All Courses
    @GetMapping
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // GET - Get Course by ID
    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    // PUT - Update Course
    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {

        Course existingCourse = courseRepository.findById(id).orElse(null);

        if (existingCourse != null) {
            existingCourse.setCourseName(course.getCourseName());


            return courseRepository.save(existingCourse);
        }

        return null;
    }

    // DELETE - Delete Course
    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseRepository.deleteById(id);
    }
}