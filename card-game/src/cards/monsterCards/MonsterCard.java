package cards.monsterCards;

import java.util.ArrayList;

import cardEnums.CardType;
import cardEnums.ElementType;
import cardEnums.MonsterType;
import cards.Card;

public class MonsterCard extends Card{
	private int monsterLevel;
	private ElementType element;
	private MonsterType monsterType;
	private ArrayList<Enum<?>> monsterAttributes; 
	
	private int atk;
	private int def;
	private String description;
	
	private ArrayList<Enum<?>> allAttributes = new ArrayList<Enum<?>>();
	
	
	public MonsterCard(String name, ElementType element,
			ArrayList<Enum<?>> monsterAttributes, int atk, int def) {
		
		super(name, CardType.MONSTER);
		
		this.element = element;

		this.monsterAttributes = monsterAttributes;
		this.monsterType = (MonsterType) monsterAttributes.get(0);
		
		this.atk = atk;
		this.def = def;
		
		this.allAttributes.addAll(monsterAttributes);
		this.allAttributes.add(element);
		
		calculateMonsterLevel();
		calculateMonsterRarity();
		generateDescription();
	}



	public ElementType getElement() {
		return element;
	}
	public void setElement(ElementType element) {
		this.element = element;
	}
	
	
	/*
	 * Monster level on a scale from 1 to 8 in order of least to most powerful
	 * Monsters base this on the sum of their Atk and Def power relative to the max (10,000)
	 */
	public int getMonsterLevel() {
		return monsterLevel;
	}
	public void calculateMonsterLevel() {
		this.monsterLevel = MonsterLevelGenerator.calculateMonsterLevel(getAtk(), getDef());
	}

	
	/*
	 * Rarity on a scale from 1 to 10 in order of least to most rare
	 * Monsters base this on the sum of their Atk and Def power relative to the max (10,000)
	 */
	public int getMonsterRarity() {
		return super.getRarity();
	}
	public void calculateMonsterRarity() {
		int rarity = MonsterRarityGenerator.calculateMonsterLevel(getAtk(), getAtk());
		super.setRarity(rarity);
	}


	public MonsterType getMonsterType() {
		return monsterType;
	}
	public void setMonsterType(MonsterType monsterType) {
		this.monsterType = monsterType;
	}



	public ArrayList<Enum<?>> getMonsterAttributes() {
		return monsterAttributes;
	}
	public void setMonsterAttributes(ArrayList<Enum<?>> monsterAttributes) {
		this.monsterAttributes = monsterAttributes;
	}



	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}



	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}



	public void generateDescription() {
		StringBuilder description = new StringBuilder();
		
		description.append(getName());
		description.append(" is a ");
		description.append(getMonsterAttributes());
		description.append(" type, who thrives in a ");
		description.append(getElement());
		description.append(" environment.");
		
		
		
		this.description = description.toString();
	}
	public String getDescription() {
		return this.description;
	}



	
	@Override
	public String toString() {
		StringBuilder objectString = new StringBuilder();
		objectString.append(
				"Name:\t\t\t" + super.getName()
				+ "\nID:\t\t\t" + super.getId()
				+ "\nRarity:\t\t\t" + super.getRarity()
				+ "\nCard Type:\t\t" + super.getType()
				+ "\nMonster level:\t\t" + monsterLevel
				+ "\nMonster element:\t" + element
				+ "\nMonster attributes:\t" + monsterAttributes
				+ "\nAll attributes:\t\t" + allAttributes
				+ "\nAttack points:\t\t" + atk
				+ "\nDefence points:\t\t" + def
				+ "\nDescription:\t\t" + description
				+ "\n\n");
		
		
		
		return objectString.toString();
	}

	
}
