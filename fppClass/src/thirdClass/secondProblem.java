package thirdClass;

public class secondProblem {
	
	public static void main(String[] args) {
		
		String word = "hola";
		int firstValue= word.charAt(0);
		
		System.out.println(getMinChar("abxcdefghi",firstValue));
//        char ch = 'c';
//        int ascii = ch;
//        // You can also cast char to int
//        int castAscii = (int) ch;
//
//        System.out.println("The ASCII value of " + ch + " is: " + ascii);
//        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
	}
	
	static String getMinChar(String word, int firstValue) {
	String lastWord="";
		if(word== null|| word.length()==0)
			return lastWord;
		
		String first = ""+word.charAt(0);
		int newValue = first.charAt(0);
		if(firstValue<newValue) {
			firstValue=newValue;
			lastWord=""+first.charAt(0);
		}
		
		return getMinChar(word.substring(1),firstValue)+lastWord;
		
		
		
		
	}

}
