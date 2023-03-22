package decoratordemo.decorator;

import decoratordemo.decorator.interfaces.Database;

public class SimpleDatabase implements Database{

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return "Base";
	}

	@Override
	public void write(String value) {
		System.out.println(value);
	}

}
