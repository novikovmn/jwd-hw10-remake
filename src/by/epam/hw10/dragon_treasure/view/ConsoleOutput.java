package by.epam.hw10.dragon_treasure.view;

import java.util.List;

import by.epam.hw10.dragon_treasure.bean.Treasure;
import by.epam.hw10.dragon_treasure.controller.dto.ApplicationResponse;

public class ConsoleOutput {
	
	private static final ConsoleOutput instance = new ConsoleOutput();
	
	private ConsoleOutput() {
		
	}
	
	public static ConsoleOutput getInstance() {
		return instance;
	}
	
	
	public void printTreasures(List<Treasure> treasures) {
		for (Treasure treasure : treasures) {
			System.out.println(treasure);
		}
	}
	
	public void printTreasures(Treasure treasures) {
		System.out.println(treasures);
	}
	
	public void printLastGoodBye() {
		System.out.println("Have a nice day)");
	}
	
	public void printNoSuchOperation(ApplicationResponse response) {
		System.out.println(response.getOperationName() + " -> " + response.getErrorMessage());
	}

}
