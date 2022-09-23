package by.epam.hw10.dragon_treasure.controller.dto;

import java.util.List;

import by.epam.hw10.dragon_treasure.bean.Treasure;

public class ApplicationResponse {

	private String operationName;
	private Treasure treasure;
	private List<Treasure> treasures;
	private String errorMessage;

	public ApplicationResponse(String operationName, Treasure treasure) {
		this.operationName = operationName;
		this.treasure = treasure;
	}

	public ApplicationResponse(String operationName, List<Treasure> treasures) {
		this.operationName = operationName;
		this.treasures = treasures;
	}

	public ApplicationResponse(String operationName, String errorMessage) {
		this.operationName = operationName;
		this.errorMessage = errorMessage;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public Treasure getTreasure() {
		return treasure;
	}

	public void setTreasure(Treasure treasure) {
		this.treasure = treasure;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
