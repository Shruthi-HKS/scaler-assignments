package builderpattern;

public interface IcustomerBuilder {
	IcustomerBuilder firstName(String firstName);
	IcustomerBuilder middleName(String middleName);
	IcustomerBuilder lastName(String lastName);
	IcustomerBuilder primaryEmail(String primaryEmail);
	IcustomerBuilder secondaryEmail(String secondaryEmail);
	IcustomerBuilder primaryPhoneNumber(Long primaryPhoneNumber);
	IcustomerBuilder secondaryPhoneNumber(Long secondaryPhoneNumber);
	Customer build();

}
