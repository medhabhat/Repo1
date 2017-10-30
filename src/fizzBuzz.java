
public class fizzBuzz {
	public static void main(String args[]){
	for(int i = 1; i<=100; i++) {
		
		String out = "";
		if(i%3!=0 && i%5!=0) {
			out=Integer.toString(i);
		}
		if(i%3==0) {
			out="fizz";
		}
		if(i%5==0) {
			out= out + "buzz";
		}
			
		
		
		System.out.println(out);

	}
}
}




