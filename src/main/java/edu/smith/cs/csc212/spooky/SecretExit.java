package edu.smith.cs.csc212.spooky;

public class SecretExit extends Exit {
	/** A secret exit exists in the third attic room. Instead of going
	 *  into the dumbwaiter, go through the door
	 */
	
	/**
	 * This exit is secret
	 */
	public boolean hidden = true;
	
	/**
	 * Create new SecretExit
	 * @param target - where it leads
	 * @param description - what it looks like
	 * @param hidden - is the exit secret (always true at start)
	 */
	public SecretExit(String target, String description) {
		super(target, description);
		this.hidden = hidden;
	}
	
	/**
	 * A getter for the visibility of the exit
	 * @return hidden - is the exit hidden
	 */
	public boolean getHidden() {
		return this.hidden;
	}
	
	/**
	 * Changes exit from secret to visible
	 */
	public void search() {
		this.hidden = false;
	}

}
