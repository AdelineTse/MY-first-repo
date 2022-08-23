
/**
 * Adeline Tse
 * 8/23/22
 * Notes for Chapter 1 Java
 * Write a description where we are going to take some code notes
 * Who helped me: 
 *
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class chapter_1_Notes
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Chapter_1_Notes
     */
    public chapter_1_Notes()
    {
        // initialise instance variables
        x = 0;
    
    }

    /**
     * Main method
     *
     * where we are going to code
     * 
     */
    public static void main(String[] args)
    {
         Scanner keyboard = new Scanner(System.in);
         // these are the basic data types
         
         int x = 9, y, z;
         //they do about the same thing but we use doubles 
         double num = 5, num1 = 23.4567, num2;
         float anum = 7;
         
         //you can only use single quotes for char and double quotes for strings 
         char letter = 'd';
         
         boolean choice = false;
         //longs store longer integers past 16 million
         long a = 9;
         short b = 5;
         
         //These are objects
         String word = new String("Kevin Hayes");
         Integer number = new Integer(47);
         Double number2 = new Double(34.5);
    }
}
