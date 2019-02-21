package chapter7_Inheritance;

public class ABomberAlien extends Alien {

	public ABomberAlien() {
		super();
		setDamage(30);
		setHealth(1);
		setName("Bomber Alien");

	}

	public int getDamage() {
		return super.getDamage();
	}
}
