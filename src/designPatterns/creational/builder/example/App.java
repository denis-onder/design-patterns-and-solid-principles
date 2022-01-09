package designPatterns.creational.builder.example;

public class App {

	public static void main(String[] args) {
		Student student = new StudentBuilder("Student Name", "Some University").setAge(20).build();

		System.out.println(student.toString());
	}

}
