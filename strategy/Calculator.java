package strategy;

public class Calculator {
	OperationStrategy operation;

	public Calculator(OperationStrategy operation) {
		super();
		this.operation = operation;
	}

	public void setOperation(OperationStrategy operation) {
		this.operation = operation;
	}

	public int performOperation(int a , int b) {
		return operation.operate(a, b);
	}
	
	

}
