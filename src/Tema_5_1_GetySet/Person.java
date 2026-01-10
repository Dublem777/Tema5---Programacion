package Tema_5_1_GetySet;

public class Person {
	private String name;

	@SuppressWarnings("unused")
	private int age;

	@SuppressWarnings("unused")
	private float height;

	@SuppressWarnings("unused")
	private String work;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
