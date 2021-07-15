package com.te.game;

public class MainClass {
	public static void main(String[] args) {
//	Player1 player1 = new Player1("Sam", "machine gun", 10000);
//	player1.damageByGun1();
//	player1.damageByGun1();
//	player1.damageByGun2();
//	player1.heal();

		Player2 player2 = new Player2("Suzie", "sword", -100 , true);
		player2.damageByGun1();
		player2.damageByGun1();
		player2.damageByGun1();
		player2.damageByGun1();
		//player2.damageByGun1();
		
		player2.heal();
//		player2.damageByGun1();
//		player2.damageByGun1();
	}
}
