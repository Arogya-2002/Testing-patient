package Entity;


import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient_record")
public class PatientRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long patientId;
    
	
	
    public PatientRecord() {
		super();
	}

	public PatientRecord(Long patientId, String name, Integer age, String address) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@NonNull
    private String name;
 
    @NonNull
    private Integer age;
    
    @NonNull 
    private String address;



	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    

}
