import java.util.Random;
import java.util.Scanner;

public class Car {
	//Attributes
		public static int gear = 1; 
		public static int location; 
		public static int speed = 0;
		
		public static final int DESTINATION = 250; 
		
	//Methods 
		public static void reverseGear() {
			if (gear != -1) {
				gear = -1;
			} 
		}
		
		public static void gearUp() {
			if (gear == 6) {
				System.out.println("Cannot Increase Gear Anymore!");
				gear = 6 - 1;
			}
			
			if(gear == -1){
				gear = 1;
			}
			else {
				gear += 1;
			}
		}
		
		public static void gearDown() {
			
			if (gear == 1) {
				System.out.println("Cannot Decrease Gear Anymore!");
				gear = 1;
			}
			if (gear == -1) {
				System.out.println("Cannot Decrease Gear Anymore! Car in Reverse");
			} else {
				gear -= 1;
			}
			
		}
		
		public static int reportGear() {
			return gear;
		}
		
		public static int reportLocation() {
			return location;
		}
	
		public static int reportRemaining() {
			return DESTINATION - location; 
		}
		
		public static void moveByTime(int time){
			
			if (time > 0) {
				speed = gear * 20; 
				int delta = speed * time;
				location += delta;
			}
			else {
				System.out.println("Time Should Be Positive!!");
			}
			
		}
		
		
		public static boolean isArrived() {
			boolean hasReached; 
			
			if (location >= DESTINATION) {
				hasReached = true;
			} else {
				hasReached = false; 
			}
			
			return hasReached; 
			
		}
		
	public static void main (String[] args) {
	
	
	
	}
}
