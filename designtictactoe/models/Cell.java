package designtictactoe.models;

public class Cell {
	private Integer row;
	private Integer cols;
	private Symbol symbol;
	
	
	public Cell(Integer row, Integer cols) {
		super();
		this.row = row;
		this.cols = cols;
	}
	
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row = row;
	}
	public Integer getCols() {
		return cols;
	}
	public void setCols(Integer cols) {
		this.cols = cols;
	}
	public Symbol getSymbol() {
		return symbol;
	}
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
}
