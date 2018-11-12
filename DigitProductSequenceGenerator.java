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

import java.util.ArrayList;
import java.util.Iterator;
/**
 * This class represents a generator for a digit product sequence
 * 
 * @author Anthony Schulz
 *
 */
public class DigitProductSequenceGenerator {
  private final int INIT; // initial number
  private final int SIZE; // size of sequence
  private ArrayList<Integer> sequence; // ArrayList object storing the sequence
  
  /**
   * Constructs a new DigitProductSequenceGenerator object.
   * @param init determines the first element in the sequence
   * @param size determines the number of elements in the sequence
   */
  
  public DigitProductSequenceGenerator(int init, int size) {
    if (size <= 0) throw new IllegalArgumentException("WARNING: CANNOT create a sequence with size <= zero.");
    if (init <= 0) throw new IllegalArgumentException("WARNING: The starting element for digit product sequence cannot be less than or equal to zero.");
    this.INIT = init;
    this.SIZE = size;
    this.sequence = new ArrayList<Integer>();
    generateSequence();
  }
  
  /**
   * This method generates the digit product sequence based on the parameters set in the constructor.
   * It is void because the sequence is stored in an ArrayList<Integer> object within the class.
   * The sequence can be accessed and iterated via the getIterator() method defined below.
   */
  
  public void generateSequence() {
    this.sequence.clear();
    this.sequence.add(this.INIT);
    int sum = 0;
    String sumNum = "";
    String[] nums;
    int addend;
    
    for (int i = 1; i < this.SIZE; i++) {
      sum = this.sequence.get(i - 1);
      sumNum = (new Integer(sum)).toString();
      nums = sumNum.split("");
      addend = 1;
      for (int j = 0; j < nums.length; j++) {
        if (!nums[j].equals("0")) {
          addend = addend * Integer.parseInt(nums[j]);
          
        }
      }
      this.sequence.add(sum + addend);
      
    }
  }
  
  /**
   * Provides an iterator for the sequence contained by the class.
   * This is the only way for the sequence to be accessed outside of this class.
   * 
   * @return an iterator for the 'sequence' ArrayList inside the class.
   * 
   */
  public Iterator<Integer> getIterator(){
    return this.sequence.iterator();
  }
  
  
  
  
  
}
