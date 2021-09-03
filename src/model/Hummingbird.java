package model;

public class Hummingbird {
	// Added by Elizabeth Allen
	private String name;
	private String type;
	private int wingBeats;
	
	public Hummingbird() {
		
	}
	
	public Hummingbird(String name, String type, int wingBeats) {
		this.name = name;
		this.type = type;
		this.wingBeats = wingBeats;
	}

	public String makeNoise() {
		return "squeak whirr squeak whirrrrr";		
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getWingBeats() {
		return wingBeats;
	}
	
	public void setWingBeats(int wingBeats) {
		this.wingBeats = wingBeats;
	}
	
	
	
	
}
