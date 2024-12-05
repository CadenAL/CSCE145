// Caden Luksic
// Location: Homework06/src/clocktimedemo/ClockTimeDemo.java
// Created on: [11/12/2024]
// Last modified on: [11/12/2005]
// Course: [Algorithmic Design I]

import java.util.Scanner;

public class ClockTimeDemo {
    
    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        String repeat;

        do {
            int hours = -1, minutes = -1, seconds = -1;

            //valid hours input
            while (hours < 0 || hours > 23) {
                System.out.println("Enter the hours on the military clock (0-23):");
                if (key.hasNextInt()) {
                    hours = key.nextInt();
                    if (hours < 0 || hours > 23) {
                        System.out.println("Invalid hours. Please enter a value between 0 and 23.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer for hours.");
                    key.next();
                }
            }

            //valid minutes input
            while (minutes < 0 || minutes > 59) {
                System.out.println("Enter the minutes on the military clock (0-59):");
                if (key.hasNextInt()) {
                    minutes = key.nextInt();
                    if (minutes < 0 || minutes > 59) {
                        System.out.println("Invalid minutes. Please enter a value between 0 and 59.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer for minutes.");
                    key.next();  //invalid input
                }
            }

            //valid seconds input
            while (seconds < 0 || seconds > 59) {
                System.out.println("Enter the seconds on the military clock (0-59):");
                if (key.hasNextInt()) {
                    seconds = key.nextInt();
                    if (seconds < 0 || seconds > 59) {
                        System.out.println("Invalid seconds. Please enter a value between 0 and 59.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter an integer for seconds.");
                    key.next();
                }
            }

            TimeConverter timeConverter1 = new TimeConverter();
            timeConverter1.updateTime(hours, minutes, seconds);
            System.out.print("12-hour clock time → ");
            timeConverter1.displayTime();

            key.nextLine();

            //valid 24-hour time format input
            String time = "";
            boolean validTimeFormat = false;
            while (!validTimeFormat) {
                System.out.println("Enter 24-hour clock time in the format \"hours:minutes:seconds\":");
                time = key.nextLine();
                validTimeFormat = time.matches("([01]?\\d|2[0-3]):[0-5]?\\d:[0-5]?\\d");
                
                if (!validTimeFormat) {
                    System.out.println("Invalid time format. Please follow the format \"hours:minutes:seconds\".");
                }
            }

            TimeConverter timeConverter2 = new TimeConverter();
            timeConverter2.updateTime(time);
            System.out.print("12-hour clock time → ");
            timeConverter2.displayTime();

            System.out.println("Would you like to do this again? Enter “Yes” or “No”:");
            repeat = key.nextLine();

        } while (repeat.equalsIgnoreCase("Yes"));

        System.out.println("Exiting the program!");
    }
}
