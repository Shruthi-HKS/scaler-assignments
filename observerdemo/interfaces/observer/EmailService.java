package observerdemo.interfaces.observer;

import observerdemo.interfaces.Observer;

public class EmailService implements Observer{

	@Override
	public void consume() {
		System.out.println("Sending email");
	}

}
