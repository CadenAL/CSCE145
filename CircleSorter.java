//Caden Luksic 10/12/2024 - Homework04/src/CircleSorter

import java.util.Scanner;

public class CircleSorter {

	public static final double PI = 3.14;
	public static void main(String[] args) {

		Scanner key = new Scanner(System.in); //creating a scanner object
		
		//variable creation
		int collection;
		double[] radius; //making the radius stored in an array
	    double[] area;//making the area stored in an array 
		
		//asking the user for the amount of circles they would like to store
		do {
			System.out.println("How many circles would you like to store?:");
			collection = key.nextInt();
			if (collection <= 0) {
				System.out.println("Invalid range entered. Please enter a valid range.");
			}
		} while (collection <= 0);
		
		//creating the arrays
		radius = new double[collection];
		area = new double[collection];
		
		//asking the user to input the radius of each circle
		for (int i = 0; i < collection; i++) {
			System.out.println("Enter the radius for circle " + (i + 1) + ":");
			radius[i] = key.nextDouble();
			area[i] = PI * Math.pow(radius[i], 2);
		}
		
		 int response;
	        do {
	            System.out.println("1.) Sort areas by biggest to smallest.");
	            System.out.println("2.) Sort areas by smallest to biggest.");
	            System.out.println("3.) Display all unique areas.");
	            System.out.println("4.) Quit Program.");

	            response = key.nextInt();

	            //validate response
	            if (response <= 0 || response > 4) {
	                System.out.println("Invalid option. Please enter a number between 1 and 4.");
	                continue;
	            }

	            switch (response) {
	                case 1:
	                    System.out.println("Sorting areas by biggest to smallest.");
	                    for (int i = 0; i < area.length - 1; i++) {
	                        int maxIndex = i;
	                        for (int j = i + 1; j < area.length; j++) {
	                            if (area[j] > area[maxIndex]) {
	                                maxIndex = j;
	                            }
	                        }
	                        double temp = area[maxIndex];
	                        area[maxIndex] = area[i];
	                        area[i] = temp;
	                    }
	                    break;

	                case 2:
	                    System.out.println("Sorting areas by smallest to biggest.");
	                    for (int i = 0; i < area.length - 1; i++) {
	                        int minIndex = i;
	                        for (int j = i + 1; j < area.length; j++) {
	                            if (area[j] < area[minIndex]) {
	                                minIndex = j;
	                            }
	                        }
	                        double temp = area[minIndex];
	                        area[minIndex] = area[i];
	                        area[i] = temp;
	                    }
	                    break;

	                case 3:
	                    System.out.println("Displaying unique areas.");
	                    for (int i = 0; i < area.length; i++) {
	                        boolean isUnique = true;
	                        //check if area[i] has already been displayed
	                        for (int j = 0; j < i; j++) {
	                            if (area[i] == area[j]) {
	                                isUnique = false;
	                                break;
	                            }
	                        }
	                        //display the unique area
	                        if (isUnique) {
	                            System.out.print(area[i] + " ");
	                        }
	                    }
	                    System.out.println();
	                    break;

	                case 4:
	                    System.out.println("Quitting program!");
	                    break;

	                default:
	                    System.out.println("Invalid option.");
	                    break;
	            }

	            //display the sorted areas
	            if (response == 1 || response == 2) {
	                System.out.println("Sorted areas:");
	                for (double a : area) {
	                    System.out.print(a + ", ");
	                }
	                System.out.println();
	            }

	        } while (response != 4); //repeat until user quits the loop

	}
	
}
