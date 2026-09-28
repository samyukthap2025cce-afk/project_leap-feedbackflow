package com.example.course_feedback_system.controller;

import com.example.course_feedback_system.model.Question;
import com.example.course_feedback_system.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @PostMapping
    public Question create(@RequestBody Question question) {
        return service.createQuestion(question);
    }

    @GetMapping
    public List<Question> getAll() {
        return service.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Question getById(@PathVariable Long id) {
        return service.getQuestionById(id);
    }

    @PutMapping("/{id}")
    public Question update(@PathVariable Long id,
                           @RequestBody Question question) {
        return service.updateQuestion(id, question);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteQuestion(id);
        return "Question deleted successfully";
    }
}