//Caden Luksic
//Location: Homework06/src/timeexception/TimeException.java
//Created on: [11/12/2024]
//Last modified on: [11/12/2005]
//Course: [Algorthmic Design I]

public class TimeException extends Exception {
    //default constructor
    public TimeException() {
        super("EXCEPTION: Invalid time entered");
    }

    //parameterized constructor
    public TimeException(String message) {
        super(message);
    }
}

