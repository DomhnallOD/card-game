package cardGenerator;

import cards.monsterCards.MonsterCard;

public class CardListGenerator {

	public CardListGenerator() {}
	
	public void generateCardList() {
		
		// TODO Generate 700 monster cards
		for(int i = 0; i <= 700; i++) {
			MonsterCardGenerator mcg = new MonsterCardGenerator();
			MonsterCard mc = mcg.generate();
			System.out.println(mc.toString());

		}
		
		// TODO: Generate 175 magic cards
		for(int i = 0; i <= 175; i++) {
			//Call monster card generator
		}
		
		// TODO: Generate 125 trap cards
		for(int i = 0; i <= 125; i++) {
			//Call monster card generator
		}
	}

}
