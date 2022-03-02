package src;

import java.util.ArrayList;

public class BookingManager implements Manager{

    private static BookingManager bookingManager;

    private ArrayList<Plane> planes; //We will store all the planes in this arraylist
    private ArrayList<Hotel> hotels; //We will store all the hotels in this arraylist


    private BookingManager(){

    }

    public static BookingManager getInstance() {

        if (bookingManager == null)
            bookingManager = new BookingManager();

        return bookingManager;   

    }
    
}
