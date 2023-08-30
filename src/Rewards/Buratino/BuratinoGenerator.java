package Rewards.Buratino;

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class BuratinoGenerator extends ItemGenerator {
	@Override
	public IGameItem createItem() {
		return new BuratinoRewards();
	}
}
