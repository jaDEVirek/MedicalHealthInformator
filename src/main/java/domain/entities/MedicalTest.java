package domain.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class MedicalTest {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Version
  private int version;
  @Column
  private String name;
  @Column(length = 2000)
  private String description;
  @OneToOne
  @JoinColumn(name = "range_Id", referencedColumnName = "id")
  private MedicalRange range;
  @Column
  private String aboveNormSymptoms;
  @Column
  private String aboveNormReasons;
  @Column
  private String belowNormReasons;
  @Column
  private String belowNormSymptoms;


}
