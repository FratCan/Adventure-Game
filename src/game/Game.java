package game;
import java.util.Scanner;

public class Game {
	Player player;
	Location location;
    Scanner scanner=new Scanner(System.in);
	
	public void login(){
			Scanner scanner = new Scanner(System.in); 
			System.out.println("Macera oyununa hosgeldiniz");
			System.out.print("Oyuna baslamadan once isminizi girin: ");
			
			String playername=scanner.nextLine();
			
			player=new Player(playername);
		
		player.selectCha();

				
		start();
	}
	public void start() {
		while(true) {
			System.out.println();
			System.out.println("==============START==============");
			System.out.println();
			System.out.println("Bir mekan secin");
			System.out.println("1-Guvenli ev--> Dusman yok size ait bir mekan");
			System.out.println("2-Magara-->	Karsiniza zombi cikabilir dikkat edin !!!");
			System.out.println("3-Orman--> 	Karsiniza vampir cikabilir dikkat edin !!!");
			System.out.println("4-Nehir--> 	Karsiniza ayi cikabilir dikkat edin !!!");
			System.out.println("5-Magaza-->	Silah veya zirh alabilirsiniz !!!");
			System.out.print("Mekan: ");
			int selLoc=scanner.nextInt();
			
			while(selLoc<0 || selLoc>5){
				System.out.print("Lutfen gecerli bir mekan secin: ");
				selLoc=scanner.nextInt();
			}
		
			
			switch(selLoc) {
			case 1:
				location=new SafeHouse(player);
				break;
			case 2:{
				location=new Cave(player);
				break;
			}
			case 3:{
				location=new Forest(player);
				break;
			}
			case 4:{
				location=new River(player);
				break;
			}
			case 5:
				location=new ToolStore(player);
				break;
			default:
				location=new SafeHouse(player);
				break;
			}
			if(!location.getLocation()) {
				System.out.println("oyun bitti!");
				break;
			}
		}
		
	}
	

}
