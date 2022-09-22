package by.epam.hw10.dragon_treasure.bean;

import java.util.ArrayList;
import java.util.List;

public class DragonCaveCreator {

	public static DragonCave createDragonCave() {

		DragonCave dragonCave = null;

		List<Treasure> treasures = new ArrayList<>();
		treasures.add(new Treasure("Незерак", 120.0));
		treasures.add(new Treasure("Светокамень", 75.0));
		treasures.add(new Treasure("Призмарин", 215.10));
		treasures.add(new Treasure("Поршень", 50.0));
		treasures.add(new Treasure("Динамит", 320.0));
		treasures.add(new Treasure("Лазурит", 500.0));
		treasures.add(new Treasure("Золотой меч", 700.0));
		treasures.add(new Treasure("Порох", 61.0));
		treasures.add(new Treasure("Уголь", 35.0));
		treasures.add(new Treasure("Печенье", 10.0));

		dragonCave = new DragonCave(treasures);

		return dragonCave;

	}

}
