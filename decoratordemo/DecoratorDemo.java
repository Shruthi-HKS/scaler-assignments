package decoratordemo;

import decoratordemo.decorator.CompressionDecorator;
import decoratordemo.decorator.Encryption;
import decoratordemo.decorator.SimpleDatabase;
import decoratordemo.decorator.interfaces.Database;

public class DecoratorDemo {
	public static void main(String[] args) {
		Database db = new SimpleDatabase();
		String value = db.read();
		System.out.println(value);
		Database compressed = new CompressionDecorator(db);
		System.out.println(compressed.read());
		
		Database encrypt = new Encryption(db);
		System.out.println(encrypt.read());
		Database encryptAndCompress = new Encryption(new CompressionDecorator(db));
		System.out.println(encryptAndCompress.read());
	}
}
