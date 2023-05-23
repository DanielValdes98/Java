
public class Fish {
	static String typeOfFish;
	static int friendliness;
	static String fishName;
	static String typeFish;
	static int kindFish;
	
	public Fish() {
		typeOfFish = null;
		friendliness = 3;
	} //end constructor
	
	public Fish(String t, int f) {
		typeOfFish = t;
		friendliness = f;
	} //end constructor

	public Fish(String name, String type, int kind ) {
		fishName = name;
		typeOfFish = type;
		friendliness = kind;
	} //end constructor
	
	public int getFriendliness() {
		return Fish.friendliness;		
	} //end getFriendliness method 
	
	public String getFishName() {
		return fishName;
	} //end getFishName method 

	public String getTypeFish(int dNI) {
		return typeOfFish;
	} //end getTypeFish method 

	public static Fish[] comparative() {		
		Fish fishArray[] = new Fish[2];
		fishArray[1] = new Fish("Amber", "AngelFish (Pez Ángel)", 5);	
		fishArray[2] = new Fish("James", "Guppy (Olomina)", 3);
		return fishArray;
	}
	
	public void nicestFish() {
		Fish a[] = new Fish[2];
		a = comparative();
		System.out.println(a[1].getFriendliness());
	}
	
	public static void index() {
		//Fish[] fishArray = null;
		//int kindness = nicestFish(fishArray);
	}
	
} // end class
