package com.jadevirek.microservice.domain.entities;


import com.jadevirek.microservice.domain.enums.MedicalField;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class MedicalTestPackage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Enumerated
  private MedicalField medicalField;
  @OneToMany
  @JoinColumn(name = "test_id")
  private Set<MedicalTest> medicalTests = new HashSet<>();

  public MedicalTestPackage(long id, MedicalField medicalField,
      Set<MedicalTest> medicalTests) {
    this.id = id;
    this.medicalField = medicalField;
    this.medicalTests = medicalTests;
  }

  protected MedicalTestPackage() {

  }
}
