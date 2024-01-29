package game;
import java.util.Scanner;

public class Player {
	
	Scanner scanner=new Scanner(System.in);
	
	private int rHealty;
	private int damage;
	private int healty;
	private int money;
	private String name;
	private String cName;
	private Inventory inv;
	
	public Player(String name) {
		super();
		this.name = name;
		this.inv=new Inventory();
	}
	
	
	
	public void selectCha(){
		 switch(chaMenu()) {
		 	case 1:
		 		initplayer("Samuray",5,21,15);
		 		break;
		 
		 	case 2:
		 		initplayer("Okcu",7,18,20);
		 		break;
		 		
		 	case 3:
		 		initplayer("Sovalye",8,24,5);
		 		break;	
		 	default:
		 		//OYUNU BUG'A SOKMAMAK İÇİN OKÇU SEÇER BİZ SEÇMEDİĞİMİZ TAKDİRDE
		 		initplayer("Okcu",7,18,20);
		 		break;
		 }
		 System.out.println("Karakter: "+getcName()+"\t\tHasar: "+getDamage()+"\tSaglik: "+getHealty()+"\tPara: "+getMoney());
	}
	
	
	
	public int chaMenu() {
		System.out.println("Lutfen bir karakter secin ");
		System.out.println("1-Samuray\tHasar: 5\tSaglik: 21\tPara: 15");
		System.out.println("2-Okcu    \tHasar: 7\tSaglik: 18\tPara: 20");
		System.out.println("3-Sovalye\tHasar: 8\tSaglik: 24\tPara: 5");
		System.out.print("Karakter seciniz: ");
		int chaId=0;
		if(scanner.hasNextInt()) {
			chaId=scanner.nextInt();
			while(chaId<0 || chaId>3 ){
				System.out.print("Lutfen gecerli bir karakter seciniz: ");
				chaId=scanner.nextInt();
			}
			
		}else {
			System.out.println("hata gecerli bir sayi girmeniz lazim");
			scanner.next();
			chaId=chaMenu();
		}
		return chaId;
	}
	
	public int getTotalDamage(){
		return this.getDamage()+this.getInv().getDamage();
	}
	public int getTotalArmor() {
		return this.getHealty()+this.getInv().getArmor();
	}
	public void initplayer(String cname,int dmg,int hlty,int mny){
		setcName(cname);
		setDamage(dmg);
		setHealty(hlty);
		setMoney(mny);
		setrHealty(hlty);
	}

	
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealty() {
		return healty;
	}

	public void setHealty(int healty) {
		this.healty = healty;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}



	public int getrHealty() {
		return rHealty;
	}



	public void setrHealty(int rHealty) {
		this.rHealty = rHealty;
	}
	
	
}
