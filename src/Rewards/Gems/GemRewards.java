package Rewards.Gems;

import Abstractions.IGameItem;

public class GemRewards implements IGameItem {

	@Override
	public String open() {
		return "Gem";
	}
}
