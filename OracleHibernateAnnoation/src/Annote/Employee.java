package Annote;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "EMP")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMP")
	@SequenceGenerator(name = "SEQ_EMP", sequenceName = "SEQ_EMP", allocationSize = 1)
	@Column(name = "id")


	private int id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	private String middleName;
	
	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "SALARY")
	private int salary;

	// FAKE_ATTRIBUTE is a attribute of the class... but will be ignored by hibernate.
	@Transient 
	private String FAKE_ATTRIBUTE;
	
	public Employee() {
	}

	public Employee(String fname, String lname, int salary) {
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last_name) {
		this.lastName = last_name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middle_name) {
		this.middleName = middle_name;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}