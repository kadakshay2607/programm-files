package com.te.game;

public class Player2 extends Player1 {

	private int health;
	private boolean armour;

	public Player2(String name, String weapon, int health, boolean armour) {

		super(name, weapon, health);
		if(health < 0 || health > 100) {
			this.health = 100;
		}
		else {
			this.health = health;
		}

		this.armour = armour;
	}

	@Override
	public void damageByGun1() {

		if (armour) {

			this.health -= 20;

			if (this.health <= 0) {
				this.health = 0;
			}
			System.out.println(
					"Armour is on. Got hit by gun1." + " "
							+ "Health reduced by 20. " + " New Health : " + 
							this.health);
		}

		 if (!armour) {

			this.health -= 30;

			if (this.health <= 0) {
				this.health = 0;
			}
			System.out.println(
					"Armour is off. Got hit by gun1. " + ""
							+ "Health reduced by 30. " + " New Health : " + 
							this.health);
		}
		  if(this.health == 0) {
			System.out.println(getName()+ " is dead");
		}

	}

	@Override
	public void damageByGun2() {
		
		if (armour) {

			this.health -= 40;

			if (this.health <= 0) {
				this.health = 0;
			}
			System.out.println(
					"Armour is on. Got hit by gun2." + " "
							+ "Health reduced by 40. " + " New Health : " + 
							this.health);
		}

		if (!armour) {

			this.health -= 50;

			if (this.health <= 0) {
				this.health = 0;
			}
			System.out.println(
					"Armour is off. Got hit by gun2. " + ""
							+ "Health reduced by 50. " + " New Health : " + 
							this.health);
		}
		 if(this.health == 0) {
			System.out.println(getName()+ " is dead");
		}

	}

	@Override
	public void heal() {
		if(this.health <= 0) {
			System.out.println(getName()+ " is already dead.");
		}
		else {
			this.health= 100;
			System.out.println(getName()+ " is headled. New health: "+ this.health);
		}
		
	}
	
	

}
