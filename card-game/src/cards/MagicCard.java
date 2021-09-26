package cards;

import cardEnums.CardType;
import cardEnums.MagicType;

public class MagicCard extends EffectCard {

	private MagicType magicType;
	
	public MagicCard(int id, String name, int rarity, MagicType magicType) {
		super(id, name, rarity, CardType.MAGIC);

		this.magicType = magicType;
	}

}
