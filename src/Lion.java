
/**
 * @author jaiba - jaibarra
 * CIS175 - Fall 2021
 * Aug 29, 2021
 */
public class Lion {
	private String name;
	private String color;
	private String noise;
	
	
	public Lion(String initName, String initColor, String initNoise) {
		
		name = initName;
		color = initColor;
		noise = initNoise;
		
	}
	
	
	public String MakeNoise() {
		return noise;
	}
}
