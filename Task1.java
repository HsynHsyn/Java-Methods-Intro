/* Write a method that will convert Miles into Kms:
convertKM();*/ 

package Day13_Methods;

public class Task1 {

	public static void main(String[] args) {
		
		convertKM();
		
	}
	
	public static void convertKM() {
		double mile=80;
		double kms =mile * 1.6;
		System.out.println(mile + " mile = "+ kms+ " kms");
		
	}

}
