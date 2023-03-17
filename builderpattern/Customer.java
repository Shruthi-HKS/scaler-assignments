package builderpattern;

public class Customer {

	private String firstName;
	private String middleName;
	private String lastName;
	private String primaryEmail;
	private String secondaryEmail;
	private Long  primaryPhoneNumber;
	private Long secondaryPhoneNumber;
	
	
	public Customer(CustomerBuilder builder) {
		super();
		this.firstName = builder.getFirstName();
		this.middleName = builder.getMiddleName();
		this.lastName = builder.getLastName();
		this.primaryEmail = builder.getPrimaryEmail();
		this.secondaryEmail = builder.getSecondaryEmail();
		this.primaryPhoneNumber = builder.getPrimaryPhoneNumber();
		this.secondaryPhoneNumber = builder.getSecondaryPhoneNumber();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	
	public Long getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}
	
	public Long getSecondaryPhoneNumber() {
		return secondaryPhoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", primaryEmail=" + primaryEmail + ", secondaryEmail=" + secondaryEmail + ", primaryPhoneNumber="
				+ primaryPhoneNumber + ", secondaryPhoneNumber=" + secondaryPhoneNumber + "]";
	}
		
	
	
}
