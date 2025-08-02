package com.datascienceacademy.backenddatascienceacademy.dto;

import java.time.LocalDate;
import java.util.List;

public class ApplicationDto {
    private Long id;
    private String applicationId;
    private LocalDate submissionDate;
    private String fullName;
    private String courseCode;
    private List<ModuleDto> finalYearModules;



    public ApplicationDto(
            Long id,
            String applicationId,
            LocalDate submissionDate,
            String fullName,
            String courseCode,
            List<ModuleDto> finalYearModules
    ) {
        this.id = id;
        this.applicationId = applicationId;
        this.submissionDate = submissionDate;
        this.fullName = fullName;
        this.courseCode = courseCode;
        this.finalYearModules = finalYearModules;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public List<ModuleDto> getFinalYearModules() {
        return finalYearModules;
    }

    public void setFinalYearModules(List<ModuleDto> finalYearModules) {
        this.finalYearModules = finalYearModules;
    }
}
