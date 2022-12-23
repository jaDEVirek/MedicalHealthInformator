package domain.entities;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MedicalTestPackage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Enumerated
  private MedicalField medicalField;
  private Integer testCode;
  @OneToMany
  private Set<MedicalTest> medicalTests = new HashSet<>();


}
