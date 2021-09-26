package cards.monsterCards;

public class MonsterRarityGenerator {
	
	public static int calculateMonsterLevel(double atk, double def) {
		double percentTotal = (atk + def)/10000;
		int of10 = (int) Math.round(percentTotal * 10);
		
		if(of10 >= 1) {
			return of10;
		} else {
			return 1;
		}
	}

}
