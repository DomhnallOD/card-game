/*
 * This class is responsible for randomly generating the element of monster cards
 * There are a finite number of elements, as specified in the ElementType enum in cardEnums package
 */
package cards.monsterCards;

import java.util.Random;

import cardEnums.ElementType;

public class MonsterElementGenerator {
	private static Random rand = new Random();


	public static ElementType generate() {
		int enumValue = rand.nextInt(ElementType.values().length);
		return ElementType.values()[enumValue];
		
	}

}
