package edu.smith.cs.csc212.spooky;

public class SecretExit extends Exit {
	
	/**
	 * This exit is secret
	 */
	private boolean isSecret = true;
	
	/**
	 * Create new SecretExit
	 * @param target - where it leads
	 * @param description - what it looks like
	 * @param isSecret - is the exit secret (always true at start)
	 */
	public SecretExit(String target, String description) {
		super(target, description);
		this.isSecret = isSecret;
	}
	
	/**
	 * Changes exit from secret to visible
	 */
	public void search() {
		this.isSecret = false;
	}

}
