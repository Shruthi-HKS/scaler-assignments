package designtictactoe.models;

import designtictactoe.models.HumanPlayer.Builder;
import designtictactoe.strategies.PlayingStrategy;
import designtictactoe.strategies.RandomPlayingStrategy;

public class BotPlayer extends Player{
	private BotLevel level;
	private PlayingStrategy strategy = new RandomPlayingStrategy();

	
	public BotLevel getLevel() {
		return level;
	}


	public PlayingStrategy getStrategy() {
		return strategy;
	}


	public void setLevel(BotLevel level) {
		this.level = level;
	}


	@Override
	public Move makeMove(Board board) {
		return strategy.makeMove(board);
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private BotPlayer bot;
		
		public Builder() {
			this.bot = new BotPlayer();
		}
		
		
		public Builder withSymbol(Symbol symbol) {
			this.bot.setSymbol(symbol);
			return this;
		}
		
		public Builder withLevel(BotLevel level) {
			this.bot.setLevel(level);
			return this;
		}
		
		public BotPlayer build() {
			
			return bot;
		}
	}
	
	
}
