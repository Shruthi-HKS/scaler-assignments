package strategy;

public class StrategyDemo {
	public static void main(String[] args) {
		Calculator calculate = new Calculator(new Addition());
		System.out.println(calculate.performOperation(10, 15));
	}

}
