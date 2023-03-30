package designtictactoe.models;

public class User {
	private String name;
	private String email;
	private Byte[] photo;
	public User(String name, String email, Byte[] photo) {
		super();
		this.name = name;
		this.email = email;
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public Byte[] getPhoto() {
		return photo;
	}
	
}
