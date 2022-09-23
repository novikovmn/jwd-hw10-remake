package by.epam.hw10.dragon_treasure.dao;

import by.epam.hw10.dragon_treasure.bean.DragonCave;
import by.epam.hw10.dragon_treasure.main.DragonCaveCreator;

public class TreasureRepository {
	
	private static DragonCave dragonCave = DragonCaveCreator.createDragonCave();

	public static DragonCave getDragonCave() {
		return dragonCave;
	}

	public static void setDragonCave(DragonCave dragonCave) {
		TreasureRepository.dragonCave = dragonCave;
	}
}
