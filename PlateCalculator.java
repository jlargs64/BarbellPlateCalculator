import java.util.Scanner;

public class PlateCalculator {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.print("What weight would you like to use: ");
		double targetWeight = input.nextInt();
		double barbellWeight = 45;
		
		//double weightLeft = 
		targetWeight -= barbellWeight;		
		
		int use45 = 0;
		int use35 = 0;
		int use25 = 0;
		int use10 = 0;
		int use5 = 0;
		int use2Half = 0;
		
		while(targetWeight >  0) {
			
			if(targetWeight - 90 >= 0) {
				targetWeight -= 90;
				use45++;
			}
			else if(targetWeight - 70 >= 0) {
				targetWeight -= 70;
				use35++;
			}
			else if(targetWeight - 50 >= 0) {
				targetWeight -= 50;
				use25++;
			}
			else if(targetWeight - 20 >= 0) {
				targetWeight -= 20;
				use10++;
			}
			else if(targetWeight - 10 >= 0) {
				targetWeight -= 10;
				use5++;
			}
			else if(targetWeight - 5 >= 0) {
				targetWeight -= 5;
				use2Half++;
			}
			else {
				System.out.println("Error! The smallest weight to use is 2.5 and doesnt allow for microloading.");
				System.out.println("Below is the closest estimate!");
				break;
			}
					
		}
		
		System.out.println("Put this on each side of bar: ");
		System.out.println("45: " + use45);
		System.out.println("35: " + use35);
		System.out.println("25: " + use25);
		System.out.println("10: " + use10);
		System.out.println("5: " + use5);
		System.out.println("2.5: " + use2Half);
	}

}
