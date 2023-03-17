package builderpattern;

public class BuilderDemo {

	//creates objects step by step. build objects with attributes that are required by the client
	
	public static void main(String[] args) {
		Customer customer = new CustomerBuilder()
                .firstName("Tony")
                .lastName("Stark")
                .primaryEmail("tonystark@abc.com")
                .primaryPhoneNumber(Long.valueOf(9686133354l))
                .build();
		System.out.println(customer.toString());
				
	}
}
