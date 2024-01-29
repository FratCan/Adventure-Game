package game;

import java.util.Scanner;

public abstract class BattleLoc extends Location{
	

	Obstacle obstacle;
	
	public BattleLoc(Player player,String name,Obstacle obstacle) {
		super(player);
		this.obstacle=obstacle;
		this.name=name;
	}

	public boolean getLocation(){
		int obsCount=obstacle.obstaclecount();
		System.out.println("Su an "+this.getName()+" konumundasiniz.");
		System.out.println("Burada "+obstacle.getMaxnumber()+" adet "+obstacle.getName()+" yasiyor.");
		System.out.println("<S>avas / <K>ac");
		String selCase=scanner.nextLine();
		selCase=selCase.toUpperCase();
		if(selCase.equals("S")) {
			if (combat(obsCount)) {
				System.out.println(this.getName()+" konumundaki tum dusmanlar naneyi yedi :)");
				return true;
			}else {
				System.out.println("sen simdi naneyi yimedin mi:(");
				return false;
			}
		}	
		return true;
	}
	
	public boolean combat(int obsCount) {
		for(int i=0;i<obsCount;i++) {
			playerStats();
			System.out.println("-------------------------------");
			enemyStats();
		}
		return true;
	}
	
	public void playerStats() {
		System.out.println("Oyuncu degerleri\n");
		System.out.println("CAN: "+player.getTotalArmor());
		System.out.println("HASAR: "+player.getTotalDamage());
		if(player.getInv().getDamage()>0) {
			System.out.println("Silah: "+player.getInv().getwName());
		}
		if(player.getInv().getArmor()>0) {
			System.out.println("Zirh: "+player.getInv().getaName());
		}
	}
	public void enemyStats() {
		System.out.println(obstacle.getName()+" degerleri\n");
		System.out.println("CAN: "+obstacle.getHealty());
		System.out.println("HASAR: "+obstacle.getDamage());
		System.out.println("ODUL: "+obstacle.getMoney());
		
	}
	
	
	
}




