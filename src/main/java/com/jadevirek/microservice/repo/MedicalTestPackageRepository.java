package com.jadevirek.microservice.repo;


import com.jadevirek.microservice.domain.entities.MedicalTestPackage;
import com.jadevirek.microservice.domain.enums.MedicalField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalTestPackageRepository extends JpaRepository<MedicalTestPackage, Long> {

  MedicalTestPackage findByMedicalField(MedicalField medicalField);
}
