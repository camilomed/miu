package lesson1;

public class DArray7 {
public static void main(String[] args) {

	
	
    System.out.println("2D array");
    int arr3[][]= new int[2][3];
    
    arr3[0][0]=00;
    arr3[0][1]=01;
    arr3[0][2]=02;
    arr3[1][0]=10;
    arr3[1][1]=11;
    arr3[1][2]=12;
    
    
   
    
  for (int i = 0 ;i<2;i++) {
	  for(int j = 0 ;j<3;j++) {
		  System.out.print(arr3[i][j] + " ");
	  }
	  System.out.println();
	  
		  
  }
}
}
