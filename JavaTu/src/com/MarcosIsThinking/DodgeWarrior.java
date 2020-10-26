package com.MarcosIsThinking;

import java.util.Random;

// la herencia es cuando herada todos los metodos y atributos de otra clase
public class DodgeWarrior extends Warrior{
	double dodgePercent;
	Random rand= new Random();
	
	public DodgeWarrior(String name, int health, int attkMax, int blockMax, double dodgePercent) {
		super(name,health,attkMax,blockMax);
		this.dodgePercent= dodgePercent;
	
		teleportType= new CanTeleport();
	}
	public int block() {
		double chance=rand.nextDouble();
		if(chance <= dodgePercent) {
			System.out.printf("%s Dodge the Attack\n\n", this.getName());
			return 10000;
			
		}
		else {
			return 1 + (int)(Math.random() * ((blockMax-1)+1));
		}
	}
}
