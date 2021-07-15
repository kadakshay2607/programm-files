package com.te.oops;

public class CarMain {

	public static void main(String[] args) {
	//Car	st=new Maruti();
	//st.accer();
	//st.brake();
	Driver driver= new Driver();
	driver.run(new Maruti());
	driver.run(new Audi());
	
	}

}
