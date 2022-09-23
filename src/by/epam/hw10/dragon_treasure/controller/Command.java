package by.epam.hw10.dragon_treasure.controller;

import by.epam.hw10.dragon_treasure.controller.dto.ApplicationResponse;
import by.epam.hw10.dragon_treasure.controller.dto.UserRequest;

public interface Command {
	
	public ApplicationResponse execute(UserRequest userRequest);

}
