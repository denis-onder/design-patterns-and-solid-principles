package designPatterns.creational.builder.example;

public class StudentBuilder {
	private final String name;
	private final String university;
	private int age;

	public StudentBuilder(String name, String university) {
		this.name = name;
		this.university = university;
	}

	public String getName() {
		return name;
	}

	public String getUniversity() {
		return university;
	}

	public int getAge() {
		return age;
	}

	public StudentBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public Student build() {
		return new Student(this);
	}
}
