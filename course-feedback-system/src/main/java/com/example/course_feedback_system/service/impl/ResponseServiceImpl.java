package com.example.course_feedback_system.service.impl;

import com.example.course_feedback_system.model.Response;
import com.example.course_feedback_system.repository.ResponseRepository;
import com.example.course_feedback_system.service.ResponseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseServiceImpl implements ResponseService {

    private final ResponseRepository repository;

    public ResponseServiceImpl(ResponseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Response createResponse(Response response) {
        return repository.save(response);
    }

    @Override
    public List<Response> getAllResponses() {
        return repository.findAll();
    }

    @Override
    public Response getResponseById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Response updateResponse(Long id, Response response) {
        Response existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setAnswer(response.getAnswer());
            existing.setQuestion(response.getQuestion());

            return repository.save(existing);
        }

        return null;
    }

    @Override
    public void deleteResponse(Long id) {
        repository.deleteById(id);
    }
}