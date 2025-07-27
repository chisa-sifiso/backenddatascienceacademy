package com.datascienceacademy.backenddatascienceacademy.repository;

import com.datascienceacademy.backenddatascienceacademy.model.ApplicationForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationFormRepository extends JpaRepository<ApplicationForm, Long> {
}