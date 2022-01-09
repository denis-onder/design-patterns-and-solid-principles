package designPatterns.creational.builder;

public class Person implements Entity {
	private String name;
	private String email;
	private String address;
	private String city;
	private String country;
	private int age;

	public Person(PersonBuilder builder) {
		this.name = builder.getName();
		this.email = builder.getEmail();
		this.address = builder.getAddress();
		this.city = builder.getCity();
		this.country = builder.getCountry();
		this.age = builder.getAge();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String stringify() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + this.name + "\n");
		sb.append("Email: " + this.email + "\n");
		sb.append("Address: " + this.address + "\n");
		sb.append("City: " + this.city + "\n");
		sb.append("Country: " + this.country + "\n");
		sb.append("Age: " + this.age + "\n");

		return sb.toString();
	}
}
