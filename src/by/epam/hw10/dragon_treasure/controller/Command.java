package by.epam.hw10.dragon_treasure.controller;

public interface Command {
	
	public ApplicationResponse execute(UserRequest userRequest);

}
