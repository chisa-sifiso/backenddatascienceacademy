package com.datascienceacademy.backenddatascienceacademy.controller;

import com.datascienceacademy.backenddatascienceacademy.model.ApplicationForm;
import com.datascienceacademy.backenddatascienceacademy.service.ApplicationFormService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationFormController {

    private final ApplicationFormService service;

    public ApplicationFormController(ApplicationFormService service) {
        this.service = service;
    }

    @Operation(summary = "Submit a new application")
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ApplicationForm submitApplication(
            @RequestPart("data") ApplicationForm form,
            @RequestPart("cv") MultipartFile cvFile
    ) throws IOException {
        form.setSubmissionDate(LocalDate.now());
        form.setCvFile(cvFile.getBytes());
        form.setApplicationStatus("Pending");
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
