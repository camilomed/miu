package sevenClass1;

import java.util.Arrays;
import java.util.Comparator;

public class mainCity {

	
	public static void main(String[] args) {
	
		city();
	}
	
	public static void city() {
		
		City [] cAarr= new City[4];
		
		cAarr[0]= new City("California", 15);
		cAarr[1]= new City("Colorado", 25);
		cAarr[2]= new City("Iowa", 0);
		cAarr[3]= new City("Seattle", -12);
		cAarr[1].setCityName("miami");
		
//		Arrays.sort(cAarr);
		Arrays.sort(cAarr,new Comparator<City>() {

			@Override
			public int compare(City o1, City o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
		for (int i=0; i<cAarr.length;i++)
	    System.out.println(Arrays.asList(cAarr[i].toString()));

	}
}
