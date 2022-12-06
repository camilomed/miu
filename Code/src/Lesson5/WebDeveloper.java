package Lesson5;

public class WebDeveloper extends Programmer {

	
	
	boolean CanWorkOnline = true;
	public void setCanWorkOnline(boolean canWorkOnline) {
		CanWorkOnline = canWorkOnline;
	}
	public boolean getCanWorkOnline() {
		return CanWorkOnline;
		
	}
	
	public void CanWorkOnline() {
		
		System.out.println(super.getName() + ((this.CanWorkOnline)? " can work online":" cannot work online" ));
	}
	
	
}
