package com.jadevirek.microservice.service;

import com.jadevirek.microservice.domain.entities.MedicalTestPackage;
import com.jadevirek.microservice.domain.enums.MedicalField;
import com.jadevirek.microservice.repo.MedicalTestPackageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalTestPackageService {


  private final MedicalTestPackageRepository medicalTestPackageRepository;

  @Autowired
  public MedicalTestPackageService(
      MedicalTestPackageRepository medicalTestPackageRepository) {
    this.medicalTestPackageRepository = medicalTestPackageRepository;
  }

  public MedicalTestPackage findPackageForMedicalField(MedicalField medicalField) {
    return this.medicalTestPackageRepository.findByMedicalField(medicalField);
  }

  public List<MedicalTestPackage> getAll() {
    return this.medicalTestPackageRepository.findAll();
  }

}
