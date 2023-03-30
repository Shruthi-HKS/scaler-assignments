package designtictactoe.models;

public abstract class Player {
	private Symbol symbol;
	public abstract Move makeMove(Board board);
	public Symbol getSymbol() {
		return symbol;
	}
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	
}
