package observerdemo.interfaces.observer;

import observerdemo.interfaces.Observer;

public class TextService implements Observer {

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println("sending text messages");
	}

}
