package EntityClass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard1 {
	@Id
	private int id;
	private String add;
	private String DOB;
	
	@OneToOne(mappedBy="pancard")
	private Person1 person;

	public Pancard1() {
		super();
	}

	public Pancard1(int id, String add, String dOB) {
		super();
		this.id = id;
		this.add = add;
		DOB = dOB;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public Person1 getPerson() {
		return person;
	}

	public void setPerson(Person1 person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Pancard1 [id=" + id + ", add=" + add + ", DOB=" + DOB + "]";
	}
	
	
}
