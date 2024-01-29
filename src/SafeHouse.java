
public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player,"Guvenli Ev");
		
	}
	
	public boolean getLocation(){
		player.setHealty(player.getrHealty());
		System.out.println("iyilestin lan dumbuk turp gibisin...");
		System.out.println("Su an guvenli evdesin");
		return true;
	}
	
	 
}
