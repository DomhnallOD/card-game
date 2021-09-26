package cardGenerator;

import java.util.ArrayList;

import cardEnums.*;
import cardNameGenerator.MonsterNameGenerator;
import cards.monsterCards.MonsterAtkDefGenerator;
import cards.monsterCards.MonsterAttributesGenerator;
import cards.monsterCards.MonsterCard;
import cards.monsterCards.MonsterElementGenerator;

public class MonsterCardGenerator {
	
	private MonsterCard monsterCard;
	
	private String name;
	private ElementType element;
	private ArrayList<Enum<?>> monsterAttributes;
	private int atk;
	private int def;

	
	public MonsterCard generate() {
		name = MonsterNameGenerator.generate();
		element = MonsterElementGenerator.generate();
		monsterAttributes = MonsterAttributesGenerator.generate();
		atk = MonsterAtkDefGenerator.generate();
		def = MonsterAtkDefGenerator.generate();

		monsterCard = new MonsterCard(name, element, monsterAttributes, atk, def);
		return monsterCard;
	}

}
