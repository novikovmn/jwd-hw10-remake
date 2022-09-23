package by.epam.hw10.dragon_treasure.controller.dto;

public class UserRequest {

	private String operationName;
	private double totalSum;

	public UserRequest(String operationName) {
		this.operationName = operationName;
	}

	public UserRequest(String operationName, double totalSum) {
		this.operationName = operationName;
		this.totalSum = totalSum;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public double getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(double totalSum) {
		this.totalSum = totalSum;
	}

}
