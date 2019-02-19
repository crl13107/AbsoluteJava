package chapter7_Inheritance;

public class Alien {

	public static void main(String[] args) {
		ABomberAlien a = new ABomberAlien();
		AMonsterAlien b = new AMonsterAlien();
		AMarshmellowAlien c = new AMarshmellowAlien();

		// Alien[] aliens = new Alien[3];
		Alien[] aliens = { a, b, c };

		for (int i = 0; i < aliens.length; i++) {
			aliens[i].printStats();
		}
		alienFight(aliens[2], aliens[1]);
		alienFight(aliens[0], aliens[2]);
		alienFight(aliens[0], aliens[1]);

		for (int i = 0; i < aliens.length; i++) {
			aliens[i].printStats();
		}
	}

	private int damage;
	private int health;
	private String name;

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private static void checkIfAlive(Alien alien) {
		if (alien.getHealth() < 0) {
			System.out.println(alien.getName() + "Died! with " + alien.getHealth() * -1 + " Overkill!");
			alien = null;
		}

	}

	public static void alienFight(Alien on, Alien otherAlien) {
		on.setHealth(on.getHealth() - otherAlien.getDamage());
		otherAlien.setHealth(otherAlien.getHealth() - on.getDamage());
		checkIfAlive(on);
		checkIfAlive(otherAlien);

	}

	private void printStats() {
		if (this.getHealth() > 0)
			System.out.println("Name: " + this.getName() + "| health: " + this.getHealth());
		else
			System.out.println(this.getName() + " is dead!");
	}

}
