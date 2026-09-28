package com.example.course_feedback_system.controller;

import com.example.course_feedback_system.model.Response;
import com.example.course_feedback_system.service.ResponseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responses")
public class ResponseController {

    private final ResponseService service;

    public ResponseController(ResponseService service) {
        this.service = service;
    }

    @PostMapping
    public Response create(@RequestBody Response response) {
        return service.createResponse(response);
    }

    @GetMapping
    public List<Response> getAll() {
        return service.getAllResponses();
    }

    @GetMapping("/{id}")
    public Response getById(@PathVariable Long id) {
        return service.getResponseById(id);
    }

    @PutMapping("/{id}")
    public Response update(@PathVariable Long id,
                           @RequestBody Response response) {
        return service.updateResponse(id, response);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteResponse(id);
        return "Response deleted successfully";
    }
}