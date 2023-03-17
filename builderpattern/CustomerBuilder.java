package builderpattern;

public class CustomerBuilder implements IcustomerBuilder {

	private String firstName;
	private String middleName;
	private String lastName;
	private String primaryEmail;
	private String secondaryEmail;
	private Long  primaryPhoneNumber;
	private Long secondaryPhoneNumber;
	@Override
	public IcustomerBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	@Override
	public IcustomerBuilder middleName(String middleName) {
		this.middleName = middleName;
		return this;
	}
	@Override
	public IcustomerBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	@Override
	public IcustomerBuilder primaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
		return this;
	}
	@Override
	public IcustomerBuilder secondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
		return this;
	}
	@Override
	public IcustomerBuilder primaryPhoneNumber(Long primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
		return this;
	}
	@Override
	public IcustomerBuilder secondaryPhoneNumber(Long secondaryPhoneNumber) {
		this.secondaryPhoneNumber = secondaryPhoneNumber;
		return this;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPrimaryEmail() {
		return primaryEmail;
	}
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
	public Long getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}
	public void setPrimaryPhoneNumber(Long primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
	}
	public Long getSecondaryPhoneNumber() {
		return secondaryPhoneNumber;
	}
	public void setSecondaryPhoneNumber(Long secondaryPhoneNumber) {
		this.secondaryPhoneNumber = secondaryPhoneNumber;
	}
	
	public Customer build() {
        return new Customer(this);
    }

}
