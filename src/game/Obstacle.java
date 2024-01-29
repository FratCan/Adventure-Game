package game;

import java.util.Random;

public class Obstacle {
	
	private int healty;
	private int damage;
	private int money;
	private int maxnumber;
	private String name;
	
	public Obstacle(int healty, int damage, int money,String name,int maxnumber) {
		this.healty = healty;
		this.damage = damage;
		this.money = money;
		this.name=name;
		this.maxnumber=maxnumber;
	}
	
	public int obstaclecount() {
		Random r=new Random();
		return r.nextInt(this.maxnumber)+1;
	}


	public int getMaxnumber() {
		return maxnumber;
	}


	public void setMaxnumber(int maxnumber) {
		this.maxnumber = maxnumber;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealty() {
		return healty;
	}


	public void setHealty(int healty) {
		this.healty = healty;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
