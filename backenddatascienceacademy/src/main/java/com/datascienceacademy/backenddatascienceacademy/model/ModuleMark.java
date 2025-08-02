package com.datascienceacademy.backenddatascienceacademy.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class ModuleMark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String moduleName;
    private Integer mark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "application_form_id")
    @JsonIgnore
    private ApplicationForm applicationForm;

    // Constructors, getters/setters

    public ModuleMark() {}
    public ModuleMark(String moduleName, Integer mark) {
        this.moduleName = moduleName;
        this.mark = mark;
    }

    public Long getId() { return id; }

    public String getModuleName() { return moduleName; }
    public void setModuleName(String moduleName) { this.moduleName = moduleName; }

    public Integer getMark() { return mark; }
    public void setMark(Integer mark) { this.mark = mark; }

    public ApplicationForm getApplicationForm() { return applicationForm; }
    public void setApplicationForm(ApplicationForm applicationForm) { this.applicationForm = applicationForm; }
}
