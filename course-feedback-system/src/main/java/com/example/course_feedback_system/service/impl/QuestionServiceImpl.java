package com.example.course_feedback_system.service.impl;

import com.example.course_feedback_system.model.Question;
import com.example.course_feedback_system.repository.QuestionRepository;
import com.example.course_feedback_system.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository repository;

    public QuestionServiceImpl(QuestionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Question createQuestion(Question question) {
        return repository.save(question);
    }

    @Override
    public List<Question> getAllQuestions() {
        return repository.findAll();
    }

    @Override
    public Question getQuestionById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Question updateQuestion(Long id, Question question) {
        Question existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setQuestionText(question.getQuestionText());
            existing.setFeedbackForm(question.getFeedbackForm());

            return repository.save(existing);
        }

        return null;
    }

    @Override
    public void deleteQuestion(Long id) {
        repository.deleteById(id);
    }
}