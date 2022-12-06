package sixClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mainAsset {
	ArrayList<Asset> assetList = new ArrayList<Asset>();
	Scanner sc = new Scanner(System.in);
	
	
	public void createAsset() {
		
		Asset asset1 = new Asset(0, "");
		Asset asset2 = new Asset(0, "");
		Asset asset3 = new Asset(0, "");
		Asset asset4 = new Asset(0, "");
		assetList.add(asset1);
		assetList.add(asset2);
		assetList.add(asset3);
		assetList.add(asset4);
		
	}
	
	public void add(int id, String category) {
		Asset asset1 = new Asset(id, category);
		assetList.add(asset1);
	}
	public void modify () {
		System.out.println("digita la posicion a modificar");
		int pos=sc.nextInt();
		System.out.println("digita la posicion a modificar");
		int id = sc.nextInt();
		System.out.println("digita la posicion a modificar");
		String category = sc.nextLine();
		Asset asset1 = new Asset(id, category);
		assetList.add(asset1);
		
	}
	public void delete (int id) {
		System.out.println("digita la posicion a modificar");
		int pos=sc.nextInt();
		assetList.remove(pos);
	}
	
	public void search (int num) {
		int pos = assetList.indexOf(num);
		System.out.println( assetList.get(pos));
		
		Collections.sort(assetList);
	}
	
	

}
