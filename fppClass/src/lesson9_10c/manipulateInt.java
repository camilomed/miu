package lesson9_10c;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class manipulateInt {
	
	public static void main(String[] args) {
		List<Integer > listInt =  Arrays.asList(1,2,4,5,6);
		
		IntSummaryStatistics intStream =listInt.stream().collect(Collectors.summarizingInt(Integer:: valueOf));
		System.out.println("min "+intStream.getMin()+" max: "+intStream.getMax());
	}

}
