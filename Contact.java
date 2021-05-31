/* Based on the ecs 100 template
 * Code for creating a new contact object
 * Name: Keira Malan
 * Date: 1/6/21
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/** Contact object stores a name, a number, and a picture
 * Getter methods return these variables
 */
public class Contact {
    // fields
    private String name;
    private int phoneNum;
    private String image;
    
    // co-ordinates to draw contact image
    private double locX = 100;
    private double locY = 100;
    private final double WIDTH = 200;
    private final double HEIGHT = 200;
    
    /** constructor that takes a name, number, and contact image **/
    public Contact(String nm, int phNum, String img) {
        // initalise instance variables
        name = nm;
        phoneNum = phNum;
        image = img;
    }


    // getter methods to return name, number, and picture
    /**
     * Getter for name
     * @ return string the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Getter for phone number
     * @ return int the phone number
     */
    public int getPhoneNum() {
        return phoneNum;
    }
    
    /**
     * Print contact image on GUI
     */
    public void displayBook() {
        return name;
    }
    // return img
}

