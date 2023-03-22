package decoratordemo.decorator;

import decoratordemo.decorator.interfaces.Database;

public class CompressionDecorator implements Database{

	private Database database;
	
	public CompressionDecorator(Database database) {
		super();
		this.database = database;
	}

	@Override
	public String read() {
		String value = database.read();
		return decompress(value);
	}

	private String decompress(String value) {
		// TODO Auto-generated method stub
		return value + "Decompress";
	}

	@Override
	public void write(String value) {
		String compress = compress(value);
		database.write(compress);
	}

	private String compress(String value) {
		return "Compressed";
	}

}
