package interviewpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsPractice1 {

	public static void main(String[] args) {
		System.out.println("Normal..");
		IntStream range = IntStream.rangeClosed(1, 10);
		range.forEach(System.out::println);
		System.out.println("Parallel..");
		IntStream range2 = IntStream.rangeClosed(1, 10);
		range2.parallel().forEach(System.out::println);
		System.out.println(range2.isParallel());
		
		List<String> alphabets = getData();
		
		alphabets.stream().forEach(System.out::println);
		alphabets.stream().parallel().forEach(System.out::println);
		long count = Stream.iterate(0, n -> n+1)
				.limit(1000)
				.parallel().filter(StreamsPractice1::isPrime)
				.peek(s -> System.out.format("%s\t", s)).count();
		System.out.println(count);
		
	}
	
	private static List<String> getData() {

        List<String> alpha = new ArrayList<>();

        int n = 97;  // 97 = a , 122 = z
        while (n <= 122) {
            char c = (char) n;
            alpha.add(String.valueOf(c));
            n++;
        }

        return alpha;

    }
	
	private static boolean isPrime(int num) {
		if(num <= 1) return false;
		return !IntStream.rangeClosed(2, num/2).anyMatch(i -> num % i == 0);
	}
}
