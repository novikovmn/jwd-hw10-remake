package by.epam.hw10.dragon_treasure.controller.impl;

import by.epam.hw10.dragon_treasure.bean.Treasure;
import by.epam.hw10.dragon_treasure.controller.ApplicationResponse;
import by.epam.hw10.dragon_treasure.controller.Command;
import by.epam.hw10.dragon_treasure.controller.UserRequest;
import by.epam.hw10.dragon_treasure.logic.DragoncCaveLogic;

public class MostExpensiveTreasureCommandImpl implements Command{

	private final DragoncCaveLogic dragonCaveLogic = DragoncCaveLogic.getInstance();

	@Override
	public ApplicationResponse execute(UserRequest userRequest) {
		
		ApplicationResponse response = null;
		
		Treasure mostExpensiveTreasure = dragonCaveLogic.showMostExpensiveTreasure();
		String operationName = userRequest.getOperationName();
		
		response = new ApplicationResponse(operationName, mostExpensiveTreasure);
		
		return response;
	}
	
	
	
	
}
