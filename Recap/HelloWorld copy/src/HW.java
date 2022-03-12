
public class HW {
	
	public static void printMessage(String message) {
		
		System.out.println(message);
		
	}
	
	public static void printInt(Integer message) {
		
		System.out.println(message);
		
		
	}
	
	public static boolean printBool(Boolean egg) {
		
		System.out.println(egg);
		return egg;
		
	}
	
	public static String word() {
		
		
		return "bang";
	
		
	}
	
	public static void main (String[] args) {
		
		printMessage(word());
		printMessage("Meoooow");
		printBool(false);
		
	}

}
