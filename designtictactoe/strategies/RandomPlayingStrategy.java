package designtictactoe.strategies;

import java.util.List;

import designtictactoe.models.Board;
import designtictactoe.models.Cell;
import designtictactoe.models.Move;

public class RandomPlayingStrategy implements PlayingStrategy{

	@Override
	public Move makeMove(Board board) {
		List<Cell> availableCells = board.getAvailableCells();
		int randomIndex = (int) Math.random() * availableCells.size();
		Cell randomCell = availableCells.get(randomIndex);
		return new Move(randomCell.getRow(),randomCell.getCols());
	}
	

}
