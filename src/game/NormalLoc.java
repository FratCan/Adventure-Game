package game;


public abstract class NormalLoc extends Location {

	public NormalLoc(Player player,String name) {
		super(player);
		this.name=name;
	}
	
	public abstract boolean getLocation();
}
