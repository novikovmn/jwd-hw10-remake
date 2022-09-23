package by.epam.hw10.dragon_treasure.controller;

import java.util.HashMap;
import java.util.Map;

import by.epam.hw10.dragon_treasure.controller.impl.MostExpensiveTreasureCommandImpl;
import by.epam.hw10.dragon_treasure.controller.impl.NoSuchOperationCommandImpl;
import by.epam.hw10.dragon_treasure.controller.impl.AllTreasureCommandImpl;
import by.epam.hw10.dragon_treasure.controller.impl.TreasureByTotalSumCommandImpl;

public class OperationProvider {

	private Map<OperationName, Command> operations = new HashMap<>();

	public OperationProvider() {
		operations.put(OperationName.SELECT_ALL, new AllTreasureCommandImpl());
		operations.put(OperationName.MOST_EXPENSIVE, new MostExpensiveTreasureCommandImpl());
		operations.put(OperationName.BY_SUM, new TreasureByTotalSumCommandImpl());
		operations.put(OperationName.NO_SUCH_OPERATION, new NoSuchOperationCommandImpl());
	}

	public Command getOperation(String nameOfOperation) {

		OperationName operationName;
		Command operation;

		try {

			operationName = OperationName.valueOf(nameOfOperation);
			operation = operations.get(operationName);

			if (operation == null) {
				operation = operations.get(OperationName.NO_SUCH_OPERATION);
			}

		} catch (Exception e) {
			operation = operations.get(OperationName.NO_SUCH_OPERATION);
		}

		return operation;

	}

}
