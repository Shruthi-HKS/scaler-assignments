package designtictactoe.models;

import java.util.Scanner;

import designtictactoe.models.Game.Builder;
import designtictactoe.strategies.PlayingStrategy;

public class HumanPlayer extends Player {

	
	private User user;
	private Scanner scanner = new Scanner(System.in);
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static Builder builder() {
		return new Builder();
	}

	@Override
	public Move makeMove(Board board) {
		System.out.println("Enter the row and column");
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		return new Move(row,col);
	}
	
	public static class Builder {
		private HumanPlayer human;
		
		public Builder() {
			this.human = new HumanPlayer();
		}
		
		
		public Builder withSymbol(Symbol symbol) {
			this.human.setSymbol(symbol);
			return this;
		}
		
		public Builder withUser(User user) {
			this.human.setUser(user);
			return this;
		}
		
		public HumanPlayer build() {
			
			return human;
		}
	}

}
