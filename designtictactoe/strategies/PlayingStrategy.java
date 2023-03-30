package designtictactoe.strategies;

import designtictactoe.models.Board;
import designtictactoe.models.Move;

public interface PlayingStrategy {
	public Move makeMove(Board board);
}
