public class ToolStore extends NormalLoc {

	public ToolStore(Player player) {
		super(player, "Tool Store");
		
	}
	@Override
	public boolean getLocation() {
		System.out.println("Para : "+player.getMoney());
		System.out.println("1.Silahlar");
		System.out.println("2.Zirhlar");
		System.out.println("3.Cikis");
		System.out.print("Seciminiz: ");
		int selTool=scanner.nextInt();
		int selItemID;
		switch (selTool) {
		case 1: {
			selItemID=weaponMenu();
			buyWepon(selItemID);
			break;
		}
		case 2:{
			selItemID=armorMenu();
			buyArmor(selItemID);
			break;
		}
		default:
			break;
		}
		
		return true;
	}
	
	public int weaponMenu() {
		System.out.println("1. Tabanca\t <Para : 25 -Hasar : 2>");
		System.out.println("2. Kilic\t <Para : 35 -Hasar : 3>");
		System.out.println("3. Tufek\t <Para : 45 -Hasar : 7>");
		System.out.println("4. Cikis");
		System.out.print("Silah seciniz: ");
		int selWeponID=scanner.nextInt();
		return selWeponID;
	}
	
	public int armorMenu() {
		System.out.println("1. Hafif\t <Para: 15 -Engelleme: 1>");
		System.out.println("2. Orta\t 	 <Para: 25 -Engelleme: 3>");
		System.out.println("3. Agir\t 	 <Para: 40 -Engelleme: 5>");
		System.out.println("4. Cikis");
		System.out.print("Zirh seciniz: ");
		scanner.nextLine();
		int selArmorID=scanner.nextInt();
		return selArmorID;
	}
	
	public void buyWepon(int itemID) {
		int damage=0,price=0;
		String wname=null;
		switch (itemID) {
		case 1: {
			damage=2;
			wname="Tabanca";
			price=25;
			break;
		}
		case 2:{
			damage=3;
			wname="Kılic";
			price=35;
			break;
		}
		case 3:{
			damage=7;
			wname="Tufek";
			price=45;
			break;
		}
		default:
			System.out.println("Gecersiz islem");
			break;
		}
		
		if(player.getMoney()>price) {
			player.getInv().setDamage(damage);
			player.getInv().setwName(wname);
			player.setMoney(player.getMoney()-price);
			System.out.println(wname+" satin aldiniz onceki hasar: "+player.getDamage()+" yeni hasar: "+(player.getDamage()+player.getInv().getDamage()));
		}
		else {
			System.out.println("Bakiye yetersiz");
		}
		
		
	}
	
	public void buyArmor(int itemID) {
		int engelleme = 0,para=0;
		String aname=null;
		switch (itemID) {
		case 1: {
			engelleme=1;
			para=15;
			aname="Hafif";
			break;
		}
		case 2:{
			engelleme=3;
			para=25;
			aname="Orta";
			break;
		}
		case 3:{
			engelleme=5;
			para=40;
			aname="Agir";
			break;
		}
		default:
			System.out.println("Gecersiz islem");
			break;
		}
		
		if(player.getMoney()>para) {
			player.getInv().setArmor(engelleme);
			player.getInv().setaName(aname);
			player.setMoney(player.getMoney()-para);
			System.out.println(aname+" zirh satin aldiniz onceki armor:"+player.getHealty()+" yeni armor: "+(player.getrHealty()+player.getInv().getArmor()));
		}
		else {
			System.out.println("Bakiye yetersiz");
		}
	}
	
	
}
