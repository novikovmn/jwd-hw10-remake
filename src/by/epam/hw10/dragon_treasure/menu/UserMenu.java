package by.epam.hw10.dragon_treasure.menu;

import java.util.Scanner;

import by.epam.hw10.dragon_treasure.controller.DragonCaveController;
import by.epam.hw10.dragon_treasure.controller.OperationName;
import by.epam.hw10.dragon_treasure.controller.dto.ApplicationResponse;
import by.epam.hw10.dragon_treasure.controller.dto.UserRequest;
import by.epam.hw10.dragon_treasure.view.ConsoleOutput;

public class UserMenu {
	
	DragonCaveController controller = new DragonCaveController();
	ConsoleOutput output = ConsoleOutput.getInstance();
	
	public void runMenu() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("=========================================================");
			System.out.println("\tPlease, enter the required item:");
			System.out.println("1 - to show all treasures list;");
			System.out.println("2 - to show the most expensive treasure;");
			System.out.println("3 - to show treasures list for a given total sum;");
			System.out.println("0 - to end the application.");
			System.out.print(">> ");
			
			while(!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Your input is not an integer! Try again.\n>>>");
			}
			
			int input = sc.nextInt();
			
			switch (input) {
			case 1: 
				System.out.println("\tAll treasures:");
				UserRequest request1 = new UserRequest(OperationName.SELECT_ALL.name());
				ApplicationResponse response1 = controller.run(request1);
				output.printTreasures(response1.getTreasures());
				break;
			
			case 2: 
				System.out.println("\tMost expensive treasure:");
				UserRequest request2 = new UserRequest(OperationName.MOST_EXPENSIVE.name());
				ApplicationResponse response2 = controller.run(request2);
				output.printTreasures(response2.getTreasure());
				break;
			
			case 3: 				
				System.out.println("Enter total sum:");
				System.out.print(">> ");
				
				while(!sc.hasNextInt()) {
					sc.nextLine();
					System.out.print("Not an integer! Try again.\n>>>");
				}
				
				double totalSum = (double) sc.nextInt();
				
				System.out.println("\tTreasures by sum:");
				UserRequest request3 = new UserRequest(OperationName.BY_SUM.name(), totalSum);
				ApplicationResponse response3 = controller.run(request3);
				output.printTreasures(response3.getTreasures());				
				break;
				
			case 0: 
				output.printLastGoodBye();
				return;
				
			default:
				UserRequest wrongReequest = new UserRequest(String.valueOf(input));
				ApplicationResponse wrongResponse = controller.run(wrongReequest);
				output.printNoSuchOperation(wrongResponse);
			}
			
			
		}
		
		
	}

}
