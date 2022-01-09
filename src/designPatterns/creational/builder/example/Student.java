package designPatterns.creational.builder.example;

public class Student {
	private String name;
	private String university;
	private int age;

	public Student(StudentBuilder builder) {
		this.name = builder.getName();
		this.university = builder.getUniversity();
		this.age = builder.getAge();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("Name: " + this.name + "\n");
		sb.append("University: " + this.university + "\n");
		sb.append("Age: " + this.age + "\n");

		return sb.toString();
	}
}
