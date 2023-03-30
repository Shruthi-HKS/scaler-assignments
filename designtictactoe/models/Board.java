package designtictactoe.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Board {
	private List<List<Cell>> cells = new ArrayList<>();

	
	public Board(int rowCount, int columnCount) {
		IntStream.range(0, rowCount).forEach(row -> {
			List<Cell> rowCells = new ArrayList<>();
			IntStream.range(0,columnCount).forEach(column -> {
				rowCells.add(new Cell(row,column));
			});
			cells.add(rowCells);
		});
	}

	public List<List<Cell>> getCells() {
		return cells;
	}

	public void setCells(List<List<Cell>> cells) {
		this.cells = cells;
	}
	
	public boolean isEmpty(int row,int col) {
		return cells.get(row).get(col).getSymbol() == null;
	}
	
	public List<Cell> getAvailableCells(){
		return cells.stream()
				.flatMap(List::stream)
				.filter(cell -> cell.getSymbol() == null).toList();
	}
}
