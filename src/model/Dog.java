package model;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Aug 25, 2021
 */
public class Dog {
	
	private String name;
	private String color;
	private int age;
	
	public Dog() {
		super();
		
		
	}

	/**
	 * @param name
	 * @param color
	 * @param age
	 */
	public Dog(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}
	
	
	public String speak() {
		return "Woof!";
	}
}
