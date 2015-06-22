public class Monster{
	public final String TOMBSTONE = "Here Lies a Dead monster";
// instance variables...
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPostition = 0;
	private boolean alive = true;

	public String name = "Big Monster";	
// methods...
	public int getAttack(){
		return attack;	
	}
	public int getMovement(){  // this is an accessor method.
		return movement;
	}
	public int getHealth(){
		return health;
	}
	public void setHealth(int decreaseHealth){
		health = health - decreaseHealth;
		if (health<0){
			alive = false;
		}
	}
	public void setHealth(double decreaseHealth){
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health<0){
			alive = false;
		}
	}
// constructor method to initialise
	// public Monster(int newHealth, int newAttack, int newMovement){
	// 	this.health = newHealth;
	// 	this.attack = newAttack;
	// 	this.movement = newMovement;
	// }
// just incase they didn't send any stuff
	public Monster(){
	}
}