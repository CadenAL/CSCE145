// Caden Luksic
// Location: Homework06/src/timeconverter/TimeConverter.java
// Created on: [11/12/2024]
// Last modified on: [11/12/2005]
// Course: [Algorithmic Design I]

public class TimeConverter {
    //instance variables
    private int hours;
    private int minutes;
    private int seconds;
    private boolean notPM;

    //default constructor
    public TimeConverter() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.notPM = true;
    }

    //parameterized constructor
    public TimeConverter(int hours, int minutes, int seconds) {
        updateTime(hours, minutes, seconds);
    }

    //accessors
    public int getHours() { 
        return hours; 
    }
    public int getMinutes() { 
        return minutes; 
    }
    public int getSeconds() { 
        return seconds; 
    }
    public boolean isNotPM() { 
        return notPM; 
    }

    //mutators
    public void setHours(int hours) {
        if (hours >= 0 && hours <= 23) {
            this.hours = hours;
        } else {
            System.out.println("Invalid hour value. Please enter a value between 0 and 23.");
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else {
            System.out.println("Invalid minute value. Please enter a value between 0 and 59.");
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            System.out.println("Invalid second value. Please enter a value between 0 and 59.");
        }
    }

    public void setNotPM(boolean notPM) {
        this.notPM = notPM;
    }

    //update time
    public void updateTime(int hours, int minutes, int seconds) {
        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59) {
            this.notPM = hours < 12;
            this.hours = hours % 12 == 0 ? 12 : hours % 12;
            this.minutes = minutes;
            this.seconds = seconds;
        } else {
            System.out.println("Invalid time. Hours should be 0-23, minutes and seconds should be 0-59.");
        }
    }

    //update time using a string
    public void updateTime(String time) {
        String[] parts = time.split(":");
        if (parts.length == 3) {
            try {
                int hours = Integer.parseInt(parts[0]);
                int minutes = Integer.parseInt(parts[1]);
                int seconds = Integer.parseInt(parts[2]);

                //validate settime
                if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59 && seconds >= 0 && seconds <= 59) {
                    updateTime(hours, minutes, seconds);
                } else {
                    System.out.println("Invalid time. Please ensure hours are 0-23, minutes and seconds are 0-59.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid time format. Please ensure hours, minutes, and seconds are numeric.");
            }
        } else {
            System.out.println("Invalid time format. Please use the format \"hours:minutes:seconds\".");
        }
    }

    //display 12-hour time
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d %s%n", hours, minutes, seconds, notPM ? "AM" : "PM");
    }
}
