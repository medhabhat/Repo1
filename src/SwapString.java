
public class SwapString {
	public static void main(String[] args){
		String s1 = "Medha";
		String s2 = "Bhat";
		System.out.println("Before Swapping :");

		System.out.println("s1 : " + s1);

		System.out.println("s2 : " + s2);

		swapStrings(s1, s2);
	}

	public static void swapStrings(String s1, String s2) {

		// Swapping starts

		s1 = s1 + s2;

		s2 = s1.substring(0, s1.length() - s2.length());

		s1 = s1.substring(s2.length());

		// Swapping ends

		System.out.println("After Swapping :");

		System.out.println("s1 : " + s1);

		System.out.println("s2 : " + s2);
	}
}




