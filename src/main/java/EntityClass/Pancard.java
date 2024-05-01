package EntityClass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {
	
	@Id
	private int id;
	private String add;
	private String DOB;
	
	@OneToOne
	private Person person;

	public Pancard() {
		super();
	}

	public Pancard(int id, String add, String dOB) {
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Pancard [id=" + id + ", add=" + add + ", DOB=" + DOB + "]";
	}
	
	
}
