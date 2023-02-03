package lesson9_10b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class manipulateString {
	
	public static void main(String[] args) {
		
		
		List<String > listString =  Arrays.asList("Bill","thomas","Mary");
		
		System.out.println(listString.stream().collect(Collectors.joining(", ")));
	}

}
