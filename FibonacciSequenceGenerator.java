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
 * This class represents a generator for an fibonacci progression
 * This class implements the Iterator<Integer> interface
 * @author Anthony Schulz
 *
 */
public class FibonacciSequenceGenerator implements Iterator<Integer> {
  private final int SIZE; // number of elements in this sequence
  private int prev; // previous item in the sequence with respect to the current iteration
  private int next; // next item in the sequence with respect to the current iteration
  private int generatedCount; // number of items generated so far
  
 
  // constructor
  /**
   * this constructs a new FiboancciSequenceGenerator object.
   * @param size this determines the length
   */
  public FibonacciSequenceGenerator(int size) {
    if (size <= 0) throw new IllegalArgumentException("WARNING: CANNOT create a sequence with size <= zero.");
    this.SIZE = size;
    this.generatedCount = 0;
  }
 
 
  //Override hasNext() and next() methods
  /**
   * Determines whether or not the sequence is 'finished,' which means whether it is the size specified
   * in the 'size' parameter of the constructor
   * @return returns true if the sequence still needs more terms to be complete, and false otherwise
   */
  @Override
  public boolean hasNext() {
    //Time Complexity: O(3)
    
    if (this.generatedCount < this.SIZE) return true;
    else return false;
  }
  /**
   * generates the next element in the iteration and returns the current one in the same iteration
   */
  @Override
  public Integer next() {
    //Time Complexity: O(N) where N is this.generatedCount
    
    int numA = 0;
    int numB = 0;
    int numC = 1;
    int result = 0;
//    if (this.generatedCount == 0) {
//      this.prev = 0;
//      this.next = 1;
//      return 0;
//    }
    for (int i = 0; i < this.generatedCount; i++) {
      result = numC + numB;
      numA = numB;
      numB = numC;
      numC = result;
      
    }
    this.generatedCount++;
    this.prev = numA;
    this.next = numC;
    return numB;
  }
 
  // You CAN add public accessor and mutator methods as needed here in order to implement your test methods
 
}