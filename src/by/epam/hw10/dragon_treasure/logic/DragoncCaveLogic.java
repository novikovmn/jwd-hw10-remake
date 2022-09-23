package by.epam.hw10.dragon_treasure.logic;

import java.util.ArrayList;
import java.util.List;

import by.epam.hw10.dragon_treasure.bean.DragonCave;
import by.epam.hw10.dragon_treasure.bean.Treasure;
import by.epam.hw10.dragon_treasure.dao.TreasureRepository;

public class DragoncCaveLogic {

	private final DragonCave dragonCave = TreasureRepository.getDragonCave();
	
	
	private static final DragoncCaveLogic instance = new DragoncCaveLogic();
	
	private DragoncCaveLogic() {
		
	}
	
	public static DragoncCaveLogic getInstance() {
		return instance;
	}
		

	public List<Treasure> selectAllTreasures() {
		return dragonCave.getDragonTreasures();
	}

	public Treasure selectMostExpensiveTreasure() {
		List<Treasure> treasures = dragonCave.getDragonTreasures();
		Treasure result;

		double maxPrice = treasures.get(0).getPrice();
		int maxPriceIndex = 0;
		for (int i = 0; i < treasures.size(); i++) {
			if (treasures.get(i).getPrice() > maxPrice) {
				maxPrice = treasures.get(i).getPrice();
				maxPriceIndex = i;
			}
		}

		result = treasures.get(maxPriceIndex);

		return result;
	}

	public List<Treasure> selectTreasuresForAGivenTotalSum(double totalSum) {
		List<Treasure> treasures = dragonCave.getDragonTreasures();
		List<Treasure> result = new ArrayList<>();

		double sum = 0;
		boolean flag = false;

		while (!flag) {
			
			for (int i = 0; i < treasures.size(); i++) {
				
				Treasure currentTreasure = treasures.get(i);
				double currentTreasurePrice = treasures.get(i).getPrice();
				double currentSum = sum + currentTreasurePrice;
				
				if (currentSum <= totalSum) {
					result.add(currentTreasure);
					sum += currentTreasurePrice;
				} else {
					flag = true;
					break;
				}
			}
			
		}

		return result;
	}

}
