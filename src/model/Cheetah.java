package model;

/**
 * @author Shravan - spatel10
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */

public class Cheetah {
	private String name;
	private String color;
	private int height;
	private int weight;
	
	public Cheetah() {
		super();
	}

	public Cheetah(String name, String color, int height, int weight) {
		super();
		this.name = name;
		this.color = color;
		this.height = height;
		this.weight = weight;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cheetah [name=" + name + ", color=" + color + ", height=" + height + ", weight=" + weight + "]";
	}
	
	public String speak() {
		return "purr!";
	}
}
