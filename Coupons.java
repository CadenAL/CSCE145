//Caden Luksic 09/26/2024 - Coupons/Lab05

import java.util.Scanner;
public class Coupons {

	public static final int MINCOUP = 6; //creating a constant
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in); //importing a scanner object
		
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
		
		int dollars = key.nextInt();
		
		//validate
				if(dollars < 0) {
					System.out.println("Invalid value entered! Exiting the program!");
					System.exit(0);
				}
				
		//initializing items
		int coupons = dollars;
		int chocolateBars = dollars;
		int additionalChocolateBar = 0;
		
		while (coupons >= MINCOUP) {
			
			coupons -= MINCOUP;
			
			coupons++;
			additionalChocolateBar++;
			
			}
		
		chocolateBars += additionalChocolateBar;
		System.out.println("You can buy " +chocolateBars+ " and will have " +coupons+ " left!");
		
		}
			
	}

