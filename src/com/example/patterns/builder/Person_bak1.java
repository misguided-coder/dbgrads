package com.example.patterns.builder;

//Complex class designed without builder pattern
public class Person_bak1 {

	// Personal info
	String uid;
	String firstName;
	String middleName;
	String lastName;
	int age;

	// Educational info
	String qualification;
	String degreePercentace;
	String certificate;
	boolean merits;

	// Family info
	String spouse;
	int children;
	String father;
	String mother;


	public Person_bak1(String uid, String firstName, String middleName, String lastName, int age, String spouse, int children, String father,
			String mother) {
		this.uid = uid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.spouse = spouse;
		this.children = children;
		this.father = father;
		this.mother = mother;
	}

	
	public Person_bak1(String uid, String firstName, String middleName, String lastName, int age, String qualification,
			String degreePercentace, String certificate, boolean merits) {
		this.uid = uid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.qualification = qualification;
		this.degreePercentace = degreePercentace;
		this.certificate = certificate;
		this.merits = merits;
	}

	
	public Person_bak1(String uid, String firstName, String middleName, String lastName, int age) {
		this.uid = uid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
	}

	
	public Person_bak1(String firstName, String middleName, String lastName, int age, String qualification,
			String degreePercentace, String certificate, boolean merits, String spouse, int children, String father,
			String mother) {
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

	
	public Person_bak1(String uid, String firstName, String middleName, String lastName, int age, String qualification,
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

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDegreePercentace() {
		return degreePercentace;
	}

	public void setDegreePercentace(String degreePercentace) {
		this.degreePercentace = degreePercentace;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public boolean isMerits() {
		return merits;
	}

	public void setMerits(boolean merits) {
		this.merits = merits;
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

}
