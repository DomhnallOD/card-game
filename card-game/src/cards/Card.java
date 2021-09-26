/**
 * 
 */
package cards;

import cardEnums.CardType;

/**
 * @author odubh
 *
 */
public abstract class Card {
	private int id;
	private String name;
	private int rarity;
	private CardType type;
	
	public Card(String name, CardType type) {
		this.id = 0; //TODO: Auto-increment the IDs for each newly created card
		this.name = name;
		this.rarity = 0; //Rarity on a scale from 1 to 10 in order of least to most rare
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRarity() {
		return rarity;
	}

	public void setRarity(int rarity) {
		this.rarity = rarity;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}
	
	
	
	
}
