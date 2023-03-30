
package designtictactoe;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import designtictactoe.models.Board;
import designtictactoe.models.Cell;

public class BoardTest {

	@Test
	public void testDimensions() {
		Board board = new Board(3,3);
		List<List<Cell>> cells = board.getCells();
		assertEquals("No od boards created", 3,cells.size());
		List<Cell> firstRow = cells.get(0);
		assertEquals("No od boards created", 3,firstRow.size());
	}
}
