package com.te.designpattern.template;

public class GameMain {

	public static void main(String[] args) {
		CallOfDuty callOfDuty = new CallOfDuty();
		callOfDuty.play();
		System.out.println("..................");
		ClashOfClan clan = new ClashOfClan();
		clan.play();
		System.out.println("..................");
		PubG g = new PubG();
		g.play();

	}

}
