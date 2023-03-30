package designtictactoe;

import designtictactoe.exception.InvalidMoveException;
import designtictactoe.models.BotLevel;
import designtictactoe.models.BotPlayer;
import designtictactoe.models.Game;
import designtictactoe.models.GameStatus;
import designtictactoe.models.HumanPlayer;
import designtictactoe.models.Player;
import designtictactoe.models.Symbol;
import designtictactoe.models.User;

public class TicTacToeGameDemo {
	public static void main(String[] args) throws InvalidMoveException {
		Game game = createGame();
		System.out.println("Welcome to Morphy's TicTacToe");
		while(game.getGameStatus() == GameStatus.IN_PROGRESS) {
			Player nextPlayer = game.getNextPlayer();
			System.out.println("next move is of player" + nextPlayer.getSymbol());
			game.makeMove();
		}
		if(game.getGameStatus().equals(GameStatus.DRAW)) {
			System.out.println("Game Draw. No Winner");
		}
		if(game.getGameStatus().equals(GameStatus.WON)) {
			System.out.println("Game Womn" + game.getWinner().getSymbol());
		}
	}
	
	private static Game createGame() {
		Player human = HumanPlayer.builder().withSymbol(Symbol.O).withUser(new User("Shruthi","shruthi@gmail.com",null)).build();
		Player bot = BotPlayer.builder().withSymbol(Symbol.X).withLevel(BotLevel.EASY).build();
		Game game = Game.builder()
					.withDimensions(3, 3)
					.withPlayers(human).withPlayers(bot).build();
		return game;
	}
}
 	