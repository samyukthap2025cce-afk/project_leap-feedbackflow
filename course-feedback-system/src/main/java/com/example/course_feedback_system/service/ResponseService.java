package com.example.course_feedback_system.service;

import com.example.course_feedback_system.model.Response;

import java.util.List;

public interface ResponseService {

    Response createResponse(Response response);

    List<Response> getAllResponses();

    Response getResponseById(Long id);

    Response updateResponse(Long id, Response response);

    void deleteResponse(Long id);
}