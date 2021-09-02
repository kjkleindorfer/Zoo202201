package model;

/**
 * rggeleta@dmacc.edu roman-RomanGeleta
 * CIS175-Fall2021
 * Aug 31, 2021
 */
public class Cow {

//adding attributes
		private String name;
		private String color;
		private int age;
		
//constructor(default)
		public Cow() {
			super();
			
		}
		
// constructor with parameter
		public Cow(String name, String color, int age) {
			super();
			this.name = name;
			this.color = color;
			this.age = age;
		}
		
		
// getter/setter

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
//to string method
			@Override
			public String toString() {
				return "Dog [name=" + name + ", color=" + color + ", age=" + age + "]";
			}
//method
				private String speak() {
					// TODO Auto-generated method stub
					return "The Cow name is " + name + " its color is " + color +"\n and its age is " +
							age + " and it say Moo y'all";
				}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow Beny = new Cow( "Bently", "Black", 5);
		System.out.println(Beny.speak());

	}

}
