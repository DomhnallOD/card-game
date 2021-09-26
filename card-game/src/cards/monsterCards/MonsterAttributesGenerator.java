/*
 * This class is responsible for randomly generating the monster types and other attributes of monster cards
 * There are a finite number of monster types and a finite list of other attributes
 * These are specified in the MonsterType and OtherAttribute enums in cardEnums package
 * 
 * The first MonsterType enum value assigned to the monsterAttributes array will also become the main type for that monster
 * The MonsterCard class will instantiate the monsterType field as such in its constructor by referencing the 0 element
 */

package cards.monsterCards;

import java.util.ArrayList;
import java.util.Random;

import cardEnums.MonsterType;
import cardEnums.OtherAttributes;

public class MonsterAttributesGenerator {
	private static Random rand = new Random();


	public static ArrayList<Enum<?>> generate() {
		ArrayList<Enum<?>> monsterAttributes = new ArrayList<>();
		
		//The first MonsterType enum value added to monsterAttributes ArrayList will implicitly be the monsters main type
		int monsterTypeEnumValue = rand.nextInt(MonsterType.values().length);
		monsterAttributes.add(MonsterType.values()[monsterTypeEnumValue]);	
		
		//The second MonsterType enum value added to monsterAttributes ArrayList will be secondary data just for fusing logic
		monsterTypeEnumValue = rand.nextInt(MonsterType.values().length);
		monsterAttributes.add(MonsterType.values()[monsterTypeEnumValue]);	
		
		//The OtherAttributes enum value added to monsterAttributes ArrayList will be secondary data just for fusing logic
		int otherAttributesEnumValue = rand.nextInt(OtherAttributes.values().length);
		monsterAttributes.add(OtherAttributes.values()[otherAttributesEnumValue]);
				
		return monsterAttributes;
		
	}
}
