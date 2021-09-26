package cards.monsterCards;

import java.util.Random;


public class MonsterAtkDefGenerator {
	public static int generate() {
		Random rand = new Random();
		return rand.nextInt(100) * 50;
		
		
	}
}

