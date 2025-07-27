package com.datascienceacademy.backenddatascienceacademy.controller;

import com.datascienceacademy.backenddatascienceacademy.model.ApplicationForm;
import com.datascienceacademy.backenddatascienceacademy.service.ApplicationFormService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationFormController {

    private final ApplicationFormService service;

    public ApplicationFormController(ApplicationFormService service) {
        this.service = service;
    }

    @Operation(summary = "Submit a new application")
    @PostMapping
    public ApplicationForm submitApplication(@RequestBody ApplicationForm form) {
        form.setSubmissionDate(LocalDate.now());
        form.setApplicationStatus("Pending");

        // If using Base64 encoded CV string from frontend
        if (form.getCvFile() != null && !form.getCvFile().isBlank()) {
            try {
                Base64.getDecoder().decode(form.getCvFile()); // test if valid base64
            } catch (IllegalArgumentException e) {
                throw new RuntimeException("Invalid base64 CV content", e);
            }
        }

        return service.save(form);
    }

    @Operation(summary = "Get all applications")
    @GetMapping
    public List<ApplicationForm> getAllApplications() {
        return service.getAll();
    }

    @Operation(summary = "Get application by ID")
    @GetMapping("/{id}")
    public ApplicationForm getApplication(@PathVariable Long id) {
        return service.getById(id);
    }
}
