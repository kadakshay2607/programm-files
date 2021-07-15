package com.te.designpattern.template;

public interface GameInter {
	
	public abstract void init();
	public abstract void start();
	public abstract void end();

	default void play() {
		init();
		start();
		end();
	}
}
