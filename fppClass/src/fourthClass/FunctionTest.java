package fourthClass;

import static org.junit.Assert.*;

import java.net.http.HttpResponse.BodySubscriber;
import java.util.Arrays;

import org.junit.Test;

public class FunctionTest {

	@Test
	public void test() {

		
		FirstProblem fp = new FirstProblem();
		double Ooutput = fp.power(2, 5);
		double Eoutput = 32;
		
		assertTrue(Eoutput== Ooutput);
		
		secondProblem sp = new secondProblem();
		String word = "hola";
		int firstValue= word.charAt(0);
		 String OoutputSt = sp.getMinChar(word, firstValue);
		 String EoutputSt ="a";
		 
		 assertEquals(OoutputSt, EoutputSt);
		 
		 
		 BinarySearch bS = new BinarySearch();
			int[] arr = {1,5,2,7,4,1,8,6,3,5};
			int searchValue = 5;
			Arrays.sort(arr);
			int left = arr[0];
			int right = arr[arr.length-1];
				bS.binarySearch(arr,left, right,searchValue);
				 
	
	
	}
	
	
	
	
	
	
		 
	}

