package com.example.patterns.builder;

//Complexity is reduced of the class by designing with builder pattern
public class Person {

	// Required fields
	// Personal info
	String uid;
	String firstName;
	String middleName;
	String lastName;
	int age;

	// Optional fields
	// Educational info
	String qualification;
	String degreePercentace;
	String certificate;
	boolean merits;

	// Optional fields
	// Family info
	String spouse;
	int children;
	String father;
	String mother;

	public Person() {
	}

	public Person(String uid, String firstName, String middleName, String lastName, int age, String qualification,
			String degreePercentace, String certificate, boolean merits, String spouse, int children, String father,
			String mother) {
		this.uid = uid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.qualification = qualification;
		this.degreePercentace = degreePercentace;
		this.certificate = certificate;
		this.merits = merits;
		this.spouse = spouse;
		this.children = children;
		this.father = father;
		this.mother = mother;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setDegreePercentace(String degreePercentace) {
		this.degreePercentace = degreePercentace;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public void setMerits(boolean merits) {
		this.merits = merits;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	@Override
	public String toString() {
		return "Person [uid=" + uid + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", age=" + age + ", qualification=" + qualification + ", degreePercentace="
				+ degreePercentace + ", certificate=" + certificate + ", merits=" + merits + ", spouse=" + spouse
				+ ", children=" + children + ", father=" + father + ", mother=" + mother + "]";
	}

	public static class PersonBuilder {

		// Required fields
		// Personal info
		String uid;
		String firstName;
		String middleName;
		String lastName;
		int age;

		// Optional fields
		// Educational info
		String qualification;
		String degreePercentace;
		String certificate;
		boolean merits;

		// Optional fields
		// Family info
		String spouse;
		int children;
		String father;
		String mother;

		public PersonBuilder setUid(String uid) {
			this.uid = uid;
			return this;
		}

		public PersonBuilder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public PersonBuilder setMiddleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		public PersonBuilder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public PersonBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public PersonBuilder setQualification(String qualification) {
			this.qualification = qualification;
			return this;
		}

		public PersonBuilder setDegreePercentace(String degreePercentace) {
			this.degreePercentace = degreePercentace;
			return this;
		}

		public PersonBuilder setCertificate(String certificate) {
			this.certificate = certificate;
			return this;
		}

		public PersonBuilder setMerits(boolean merits) {
			this.merits = merits;
			return this;
		}

		public PersonBuilder setSpouse(String spouse) {
			this.spouse = spouse;
			return this;
		}

		public PersonBuilder setChildren(int children) {
			this.children = children;
			return this;
		}

		public PersonBuilder setFather(String father) {
			this.father = father;
			return this;
		}

		public PersonBuilder setMother(String mother) {
			this.mother = mother;
			return this;
		}

		public Person build() {
			return new Person(this.uid, this.firstName, this.middleName, this.lastName, this.age, this.qualification,
					this.degreePercentace, this.certificate, this.merits, this.spouse, this.children, this.father,
					this.mother);
		}
	}

}
