package observerdemo;

import observerdemo.interfaces.observer.EmailService;
import observerdemo.interfaces.observer.TextService;
import observerdemo.models.BitCoin;

public class ObserverDemo {
	private BitcoinTracker bitCoinTracker;
	public static void main(String[] args) {
		ObserverDemo demo = new ObserverDemo();
		demo.bitCoinTracker = new BitcoinTracker();
		demo.bitCoinTracker.subscribe(new EmailService());
		demo.bitCoinTracker.subscribe(new TextService());
		demo.bitCoinTracker.setPrice(17000.00);
		
	}
}
