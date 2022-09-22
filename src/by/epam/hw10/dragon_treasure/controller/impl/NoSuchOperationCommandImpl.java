package by.epam.hw10.dragon_treasure.controller.impl;

import by.epam.hw10.dragon_treasure.controller.ApplicationResponse;
import by.epam.hw10.dragon_treasure.controller.Command;
import by.epam.hw10.dragon_treasure.controller.OperationName;
import by.epam.hw10.dragon_treasure.controller.UserRequest;

public class NoSuchOperationCommandImpl implements Command {

	@Override
	public ApplicationResponse execute(UserRequest userRequest) {

		ApplicationResponse response = null;

		String operationName = userRequest.getOperationName();

		response = new ApplicationResponse(operationName, OperationName.NO_SUCH_OPERATION.name());

		return response;
	}

}
