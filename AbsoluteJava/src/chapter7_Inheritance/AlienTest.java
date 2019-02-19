package chapter7_Inheritance;

public class AlienTest {

	public static void main(String[] args) {
		ABomberAlien a = new ABomberAlien();
		AMonsterAlien b = new AMonsterAlien();
		AMarshmellowAlien c = new AMarshmellowAlien();

		// Alien[] aliens = new Alien[3];
		Alien[] aliens = { a, b, c };

		for (int i = 0; i < aliens.length; i++) {
			aliens[i].printStats();
		}
		Alien.alienFight(aliens[2], aliens[1]);
		Alien.alienFight(aliens[0], aliens[2]);
		Alien.alienFight(aliens[0], aliens[1]);

		for (int i = 0; i < aliens.length; i++) {
			aliens[i].printStats();
		}
	}
}
