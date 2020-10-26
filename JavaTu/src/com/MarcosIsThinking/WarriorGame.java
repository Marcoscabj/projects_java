package com.MarcosIsThinking;

public class WarriorGame {

	public static void main(String[] args) throws InterruptedException {
		Warrior tor= new DodgeWarrior("thorn",800,130,40, .25);
		Warrior loki= new Warrior("loki",800,145,80);
		Battle.startFight(tor,loki);
		
		System.out.println("Tor " + loki.teleport());
		tor.setTeleportAbility(new CantTeleport());
		System.out.println("tor" + loki.teleport());
		tor.setTeleportAbility(new CantTeleport());
		System.out.println("Tor " + tor.teleport());
	
	}
	public interface Pizza{
		public String getDescription();
		public double getCost();
	}
	public class PlainPizza implements Pizza{
		public String getDescription() {
			return "thin dough";
		}
		public double getPrice() {
			System.out.println("price of dough " + 4.00);
			return 4.00;
		}
	public abstract class Crashable{
	boolean carDrivable= true;
	public void youCrashed() {
		this.carDrivable= false;
	}
	public abstract void setCarStrength(int carStrength);
	public abstract int getCarStrength();
		}
	}
}
