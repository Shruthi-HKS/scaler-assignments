package decoratordemo.decorator;


import decoratordemo.decorator.interfaces.BaseDEcorator;
import decoratordemo.decorator.interfaces.Database;

public class Encryption implements Database{

	private Database database;
	
	
	public Encryption(Database database) {
		super();
		this.database = database;
	}

	@Override
	public String read() {
		String value = database.read();
		return decrypt(value);
	}

	private String decrypt(String value) {
		return value + "Decrypted";
	}

	@Override
	public void write(String value) {
		String encrypt = encrypt(value);
		database.write(encrypt);
	}

	private String encrypt(String value) {
		// TODO Auto-generated method stub
		return "encrypted";
	}
	
}
