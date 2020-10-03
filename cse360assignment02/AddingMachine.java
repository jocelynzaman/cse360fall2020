package cse360assignment02;

/**
 * A program to do basic addition
 * 
 * @author Jocelyn Zaman
 * @version 2.0
 * @date 10/2/2020
 */

public class AddingMachine {
  private int total;
  private String mathHistory;
  
  /**
   * Constructor of class AddingMachine
   * sets total and mathHistory to its initial values
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    mathHistory = "0";
  }
  
  /**
   * Getter method to get the value of total
   * @return total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Method to add value to the total
   * @param value
   */
  public void add (int value) {
      total += value;
      mathHistory += " + " + value;
  }

  /**
   * Method to subtract value from total
   * @param value
   */
  public void subtract (int value) {
      total -= value;
      mathHistory += " - " + value;
  }

  /**
   * Method to return the history of transactions
   * @return mathHistory
   */
  public String toString () {
    return mathHistory;
  }

  /**
   * Method clears total and history of transactions
   */
  public void clear() {
      total = 0;
      mathHistory = "0";
  }
}