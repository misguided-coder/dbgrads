package com.example.patterns.builder;

public class Main {

	public static void main(String[] args) {

		StringBuffer stringBuffer = new StringBuffer();
		String str = stringBuffer.append("Hello").append("Hi").append("Holaaaa").append("Bye").toString();
		
		Person person = new Person.PersonBuilder().setAge(23).setChildren(4).setFirstName("Raj").setLastName("Kumar")
				.setDegreePercentace("90%").setQualification("MTech").build();
		System.out.println(person);

		person = new Person.PersonBuilder().setAge(23).setFirstName("Raj").setLastName("Kumar").build();
		System.out.println(person);

		person = new Person.PersonBuilder().setFirstName("Raj").setLastName("Kumar").build();
		System.out.println(person);

		person = new Person.PersonBuilder().setFirstName("Raj").setLastName("Kumar").setSpouse("Pinki").build();
		System.out.println(person);

		person = new Person.PersonBuilder().setFirstName("Raj").setLastName("Kumar").setQualification("BE").build();
		System.out.println(person);

		person = new Person.PersonBuilder().setFirstName("Raj").setLastName("Kumar").setQualification("BE")
				.setMerits(true).build();
		System.out.println(person);

		person = new Person.PersonBuilder().setFirstName("Raj").setLastName("Kumar").setQualification("BE").setFather("Rohan")
				.setMerits(true).build();
		System.out.println(person);

	}

}
