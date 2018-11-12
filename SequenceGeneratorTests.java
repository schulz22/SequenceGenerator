//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title: (Sequence Generator)
// Files: (Sequence.java, GeometricSequenceGenerator.java, 
// FibonacciSequenceGenerator.java, DigitProductSequenceGenerator.java, 
// and SequenceGeneratorTests.java)
// Course: (CS300, Fall, 2018)
//
// Author: (Tony Schulz)
// Email: (schulz22@wisc.edu)
// Lecturer's Name: (Gary Dahl)
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
// Partner: NONE
// Partner Email: 
// Partner Lecturer's Name: 
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// __ Write-up states that pair programming is allowed for this assignment.
// __ We have both read and understand the course Pair Programming Policy.
// __ We have registered our team prior to the team registration deadline.
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully
// acknowledge and credit those sources of help here. Instructors and TAs do
// not need to be credited here, but tutors, friends, relatives, room mates,
// strangers, and others do. If you received no outside help from either type
// of source, then please explicitly indicate NONE.
//
// Persons: NONE
// Online Sources: NONE
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////


import java.util.Iterator;


/**
 * This class is for testing the functionality of the class methods written for CS300 P07.
 * Its main method prints out messages to the console indicating whether or not the tests were passed.
 * @author Anthony Schulz
 *
 */
public class SequenceGeneratorTests {
  
  /**
   * This method SHOULD be called from 
  the main method within your test class. It should return false if either 
  the constructor or hasNext() or next() method implemented in YOUR 
  GeometricSequenceGenerator class does not return the expected output.
   * @return true if geometric sequence is correctly created, false otherwise.
   */
  
  public static boolean geometricSequenceGeneratorTest() {
    
    GeometricSequenceGenerator gsg = new GeometricSequenceGenerator(1, 2, 5);
    if (gsg.hasNext() == false) return false;
    if (gsg.next() != 1) return false;
    if (gsg.next() != 2) return false;
    if (gsg.next() != 4) return false;
    if (gsg.next() != 8) return false;

    
    
    return true;
    }
  
  /**
   * This method SHOULD be called from 
  the main method within your test class. It should return false if either 
  the constructor or hasNext() or next() method implemented in YOUR 
  FibonacciSequenceGenerator class does not return the expected output.
   * @return true if geometric sequence is correctly created, false otherwise.
   */
  public static boolean fibonacciSequenceGeneratorTest() {
    FibonacciSequenceGenerator fsg = new FibonacciSequenceGenerator(5);
    if (!fsg.hasNext()) return false;
    if (fsg.next() != 0) return false;
    if (!fsg.hasNext()) return false;
    if (fsg.next() != 1) return false;
    if (!fsg.hasNext()) return false;
    if (fsg.next() != 1) return false;
    if (!fsg.hasNext()) return false;
    if (fsg.next() != 2) return false;
    if (!fsg.hasNext()) return false;
    if (fsg.next() != 3) return false;
    return true;
  }
  
  /**
   * This method should return true if your DigitProductSequenceGenerator allows 
   * the user to create a digit-product sequence with the provided initial number 
   * and the provided size.
   * @return true if geometric sequence is correctly created, false otherwise.
   */
  public static boolean digitProductSequenceGeneratorTest() {
    DigitProductSequenceGenerator dsg = new DigitProductSequenceGenerator(13, 5);
    int[] answers = {13, 16, 22, 26, 38};
    Iterator<Integer> iter = dsg.getIterator();
    for (int i = 0; i < answers.length; i++) {
      if (answers[i] != iter.next()) return false;
    }
    return true;
  }
  
  
  public static void main(String[] args) {
    System.out.println("Geometric test: " + geometricSequenceGeneratorTest());
    System.out.println("Fibonacci test: " + fibonacciSequenceGeneratorTest());
    System.out.println("Digit Product test: " + digitProductSequenceGeneratorTest());

  }

}
