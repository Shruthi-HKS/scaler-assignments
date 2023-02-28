package interviewpractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamsExample {
	private static final String DIR = System.getProperty("user.dir")+"/test/";
	
	public static void main(String[] args) throws IOException{
		Files.createDirectories(Paths.get(DIR));
		ParallelStreamsExample example = new ParallelStreamsExample();
		List<Employee> employees = example.generateEmployees(10);
		employees.parallelStream().forEach(ParallelStreamsExample::save);
	}
	
	private List<Employee> generateEmployees(int num){
		return Stream.iterate(0, n -> n+1)
				.limit(num)
				.map(x ->{
					return new Employee(generateRandomAge(15, 100),generateRandomName(4),generateRandomSalary(900.00, 200_000.00));
				}).collect(Collectors.toList());
	}

	private static void save(Employee input) {
		try(FileOutputStream fos = new FileOutputStream(new File(DIR + input.getName() + ".txt"));
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(input);
		}catch(IOException io) {
			io.printStackTrace();
		}
	}
	private String generateRandomName(int length) {
		return new Random()
				.ints(5,97,122)
				.mapToObj(x-> String.valueOf((char)x))
				.collect(Collectors.joining());
	}
	
	private int generateRandomAge(int min, int max) {
		return new Random()
				.ints(1,min, max)
				.findFirst().getAsInt();
	}
	
	private BigDecimal generateRandomSalary(double min, double max) {
		return new BigDecimal( new Random()
				.doubles(1,min,max)
				.findFirst()
				.getAsDouble()).setScale(2,RoundingMode.HALF_UP);
	}
}
