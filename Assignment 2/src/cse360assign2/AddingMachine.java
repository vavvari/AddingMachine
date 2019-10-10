// Name: Vamshi Avvari
// Assignment 2
// Class ID: 85141
package cse360assign2;

public class AddingMachine {

	private int total;
	private String log = "0"; // String variable for recording history
	
	public AddingMachine () { // default constructor for adding machine
		total = 0;  // not needed - included for clarity
		log = "0";  // included for clarity
	}
	
	public int getTotal () {	// returns current total
		return total; 
	}
	
	public void add (int value) {	// add a value to the total
		total = total + value;
		log = log + " + " + value;  // updates history when method is called
	}
	
	public void subtract (int value) { // subtract value parameter from total
		total = total - value;
		log = log + " - " + value;     // updates history when method is called
	}
		
	public String toString () { 	// returns a record of transactions
		return log;
	}

	public void clear() {	// clears history of adding machine
		log = "0";			// reset total and log to initial state
		total = 0;
	}
}