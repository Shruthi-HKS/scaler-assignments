package decoratordemo.decorator.interfaces;

public class BaseDEcorator implements Database{

	private Database db;
	@Override
	public String read() {
		// TODO Auto-generated method stub
		return db.read();
	}

	public BaseDEcorator(Database db) {
		super();
		this.db = db;
	}

	@Override
	public void write(String value) {
		// TODO Auto-generated method stub
		db.write(value);
	}


}
