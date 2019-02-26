// Name: Olivia Chan
// Class ID: 347
// Assignment #2

/**
 * Initial version contains constructor and empty methods for basic mathematical 
 * operations.
 * 
 * @author Olivia Chan
 * 
 */

package cse360assign2;

public class Calculator {

	private int total;
	private String history;
	/**
	 * Class constructor initializes <code>total</code> to zero and initializes
	 * history to zero.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * This method returns the integer <code>total</code> .
	 * @return the total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method adds the parameter to the total.
	 * @param value integer to be added to total
	 */
	public void add (int value) {
		total += value;
		history += " + " + Integer.toString(value);
	}
	
	/**
	 * This method subtracts the parameter from the total.
	 * @param value integer to be subtracted from total
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + Integer.toString(value);
	}
	
	/**
	 * This method multiplies the parameter and the total.
	 * @param value integer to be multiplied to total
	 */
	public void multiply (int value) {
		total = total * value;
		history += " * " + Integer.toString(value);
	}
	
	/**
	 * This method divides the total by the parameter. If the parameter
	 * is zero, the total is set to zero.
	 * @param value integer total is divided by
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else	
			total = total / value;
		history += " + " + Integer.toString(value);
	}
	
	public String getHistory () {
		return history;
	}
}