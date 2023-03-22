package observerdemo;

import java.util.ArrayList;
import java.util.List;

import observerdemo.interfaces.Observer;
import observerdemo.interfaces.Publisher;
import observerdemo.models.BitCoin;

public class BitcoinTracker extends Publisher{

	private BitCoin bitCoin;
	

	public void setPrice(Double value) {
		bitCoin = new BitCoin(value);
		notifyChange();
	}
	

}
