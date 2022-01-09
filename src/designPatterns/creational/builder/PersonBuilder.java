package designPatterns.creational.builder;

public class PersonBuilder implements Builder<Person> {
	// Required
	private final String name;
	private final String email;
	// Optional
	private String address;
	private String city;
	private String country;
	private int age;

	public PersonBuilder(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public PersonBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getCity() {
		return city;
	}

	public PersonBuilder setCity(String city) {
		this.city = city;
		return this;
	}

	public String getCountry() {
		return country;
	}

	public PersonBuilder setCountry(String country) {
		this.country = country;
		return this;
	}

	public int getAge() {
		return age;
	}

	public PersonBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	@Override
	public Person build() {
		return new Person(this);
	}
}
