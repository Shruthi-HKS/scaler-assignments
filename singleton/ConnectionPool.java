package singleton;

public class ConnectionPool {

	private static ConnectionPool INSTANCE = null;
	
	private ConnectionPool() {
		
	}
	
	public static ConnectionPool getInstance() {
		if(INSTANCE == null) {
			synchronized (ConnectionPool.class) {
				if(INSTANCE == null) {
					INSTANCE =  new ConnectionPool();
				}
				
			}
		}
		return INSTANCE;
	}
	
	
}
