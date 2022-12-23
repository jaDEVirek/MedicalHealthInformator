package domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class MedicalRange {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private Integer lowerNorm;
  private Integer upperNorm;
  private String testUnits;

  @ManyToOne
  private MedicalTestPackage medicalTestPackage;
  @OneToOne(mappedBy = "range")
  private MedicalTest medicalTest;

}
