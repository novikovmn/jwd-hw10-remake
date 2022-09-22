package by.epam.hw10.dragon_treasure.controller.impl;

import java.util.List;

import by.epam.hw10.dragon_treasure.bean.Treasure;
import by.epam.hw10.dragon_treasure.controller.ApplicationResponse;
import by.epam.hw10.dragon_treasure.controller.Command;
import by.epam.hw10.dragon_treasure.controller.UserRequest;
import by.epam.hw10.dragon_treasure.logic.DragoncCaveLogic;

public class TreasureByTotalSumCommandImpl implements Command{
	
	private final DragoncCaveLogic dragonCaveLogic = DragoncCaveLogic.getInstance();

	@Override
	public ApplicationResponse execute(UserRequest userRequest) {
		
		ApplicationResponse response = null;
		
		String operationName = userRequest.getOperationName();
		double totalSum = userRequest.getTotalSum();
		
		List<Treasure> treasuresByTotalSum = dragonCaveLogic.selectTreasuresForAGivenTotalSum(totalSum); 
		
		response = new ApplicationResponse(operationName, treasuresByTotalSum);
		
		return response;
	}
	
	

}
