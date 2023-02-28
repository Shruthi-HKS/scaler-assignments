package interviewpractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsPractice {
	private static Employee[] arrayOfEmployees = {
			new Employee(1, "Shruthi", 10000),
			new Employee(2,"xyz",20000),
			new Employee(3,"abc",2000)
	};
	
Stream<Employee> stream = Stream.of(arrayOfEmployees); //stream creation
Collection<Employee> collection = Arrays.asList(arrayOfEmployees); // converting to list
Stream<Employee> stream1 = collection.stream(); // stream creation from list

List<Employee> emplist = Stream.of(arrayOfEmployees).filter(employee -> employee.id == 1).collect(Collectors.toList());
String[] example = new String[] {"a","b","c"};
Stream<String> stream2 = Arrays.stream(example);
Stream<String> stream3 = Arrays.stream(example,1,3);

Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
Stream<String> generatedStream = Stream.generate(() -> "element").limit(10);
Stream<Integer> intStream = Stream.iterate(40,n -> n+2).limit(10);

IntStream stream4 = IntStream.range(1, 3);
LongStream stream5 = LongStream.rangeClosed(1, 3);
Random numbers = new Random();
DoubleStream stream6 = numbers.doubles();

IntStream streamOFchars = "abc".chars();
Stream<String> charStream = Pattern.compile(",").splitAsStream("a,b,c");
List<String> elements = Stream.of("a","b","c").filter(e -> e.contains("b")).collect(Collectors.toList());
Optional<String> finds = elements.stream().findAny();

Stream<String> modifiedStream = Stream.of("abc","abc1","abc2").skip(1);

Stream<String> modStream1 = Stream.of("abc1","abc2","abc3").skip(1).map(e -> e.substring(1, 3));

long size = Stream.of("abc1","abc2","abc3").skip(1).map(e -> e.subSequence(1, 3)).count();

List<String> listOfStrings = Arrays.asList("abc1","abc2","abc3");

Optional<String> stream7 = listOfStrings.stream().filter(element -> {
	return element.contains("2");
}).map(element -> {return element.toUpperCase();}).findAny();

OptionalInt num = IntStream.range(1,3).reduce((a,b) -> a+b);
int reducedParams = Arrays.asList(1,2,3).parallelStream().reduce(10, (a,b) -> a+b , (a,b) -> {
	return a+b;
});

}
