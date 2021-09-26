package cards;

import cardEnums.CardType;
import cardEnums.TrapType;

public class TrapCard extends EffectCard {
	
	private TrapType trapType;

	public TrapCard(int id, String name, int rarity, TrapType trapType) {
		super(id, name, rarity, CardType.TRAP);

		this.trapType = trapType;
	}

}
