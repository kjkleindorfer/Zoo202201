package model;
/**
 * @author Owen Miner - osminer
 * CIS 175 - Fall 2021
 * Sep 2, 2021
 */
public class Tiger {
	
	private String name;
	private String breed;
	private int stripes;
	
	public Tiger() { //default constructor
		super();
	}
	public Tiger(String name, String breed, int stripes) { //non defualt constructor
		super();
		
		this.name = name;
		this.breed = breed;
		this.stripes = stripes;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getStripes() {
		return stripes;
	}
	public void setStripes(int stripes) {
		this.stripes = stripes;
	}
	public String speak() {
		return "Chuff";
	}
	
	
}
