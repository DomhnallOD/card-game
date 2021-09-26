package cards.monsterCards;

public class MonsterLevelGenerator {
	
	public static int calculateMonsterLevel(double atk, double def) {
		double percentTotal = (atk + def)/10000;
		int of8 = (int) Math.round(percentTotal * 8);
		
		if(of8 >= 1) {
			return of8;
		} else {
			return 1;
		}
	}

}
