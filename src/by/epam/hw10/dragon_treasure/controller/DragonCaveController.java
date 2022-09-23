package by.epam.hw10.dragon_treasure.controller;

import by.epam.hw10.dragon_treasure.controller.dto.ApplicationResponse;
import by.epam.hw10.dragon_treasure.controller.dto.UserRequest;

public class DragonCaveController {

	private final OperationProvider provider = new OperationProvider();

	public ApplicationResponse run(UserRequest request) {

		String operationName = request.getOperationName();
		Command operation = provider.getOperation(operationName);

		ApplicationResponse response = operation.execute(request);

		return response;

	}

}
