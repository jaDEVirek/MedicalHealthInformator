package com.jadevirek.microservice.service;

import com.jadevirek.microservice.repo.MedicalTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalTestService {


  private final MedicalTestRepository medicalTestRepository;

  @Autowired
  public MedicalTestService(
      MedicalTestRepository medicalTestRepository) {
    this.medicalTestRepository = medicalTestRepository;
  }
}
