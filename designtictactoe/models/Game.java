package designtictactoe.models;

import java.util.ArrayList;
import java.util.List;

import designtictactoe.exception.InvalidMoveException;

public class Game {
	private Board board;
	private List<Player> players = new ArrayList<Player>();
	private int nextPlayerIndex = 0;
	private GameStatus gameStatus;
	private Player winner;
	
	public int getNextPlayerIndex() {
		return nextPlayerIndex;
	}
	public GameStatus getGameStatus() {
		return gameStatus;
	}
	public Player getWinner() {
		return winner;
	}
	public Board getBoard() {
		return board;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public static Builder builder() {
		return new Builder();
	}
	
	public void makeMove() throws InvalidMoveException {
		Player player = getNextPlayer();
		Move move = player.makeMove(board);
		if(!board.isEmpty(move.getRow(), move.getColumn())) {
			throw new InvalidMoveException("Cell is empty");
		}
		board.getCells().get(move.getRow()).get(move.getColumn()).setSymbol(player.getSymbol());
		if(checkWinner(player.getSymbol())) {
			gameStatus = GameStatus.WON;
			winner = player; 
			return;
		}
		if(checkDraw()) {
			gameStatus = GameStatus.DRAW;
			return;
		}
		
		nextPlayerIndex = (nextPlayerIndex +1) % players.size();
	}
	
	private boolean checkDraw() {
		// TODO Auto-generated method stub
		return false;
	}
	private boolean checkWinner(Symbol symbol) {
		// TODO Auto-generated method stub
		return false;
	}
	public Player getNextPlayer() {
		return players.get(nextPlayerIndex);
		
	}
	
	public static class Builder{
		private Game game;
		Builder(){
			this.game = new Game();
			this.game.gameStatus = GameStatus.IN_PROGRESS;
		}
		
		public Builder withDimensions(int row, int column) {
			Board board = new Board(row,column);
			game.board = board;
			return this;
		}
		
		public Builder withPlayers(Player player) {
			game.getPlayers().add(player);
			return this;
		}
		public Game build() {
			boolean isValid = validate();
			if(!isValid) {
				throw new RuntimeException("Game is not valid");
			}
			return game;
		}
		
		private boolean validate() {
			if(game.players.size() < 2) {
				return false;
			}
			return true;
		}
	}
}
