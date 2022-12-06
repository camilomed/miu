package secondHomework;

import java.util.ArrayList;

public class nineProblem {
	
	public static void main(String[] args) {
		storeRNA("abcdefghijkl");
	}
	
	static void storeRNA(String a) {
		int lenght= a.length()/3;
		ArrayList<String> RNA = new ArrayList<>();
		int m=0;
		for (int i =0;i<lenght;i++) {
			RNA.add(a.substring(m,3+m));
			m+=3;
		}
		System.out.println(RNA);
		
	}

}
