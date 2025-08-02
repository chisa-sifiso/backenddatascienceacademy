package com.datascienceacademy.backenddatascienceacademy.service;

import com.datascienceacademy.backenddatascienceacademy.model.ApplicationForm;
import com.datascienceacademy.backenddatascienceacademy.repository.ApplicationFormRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationFormService {

    private final ApplicationFormRepository repository;

    public ApplicationFormService(ApplicationFormRepository repository) {
        this.repository = repository;
    }

    public ApplicationForm save(ApplicationForm form) {
        return repository.save(form);
    }

    public List<ApplicationForm> getAll() {
        return repository.findAll();
    }

    public ApplicationForm getById(Long id) {
        return repository.findById(id).orElse(null);
    }
    /** New: update only the status */
    public ApplicationForm updateStatus(Long id, String newStatus) {
        ApplicationForm form = getById(id);                // throws if missing
        form.setApplicationStatus(newStatus);
        return repository.save(form);
    }
}
