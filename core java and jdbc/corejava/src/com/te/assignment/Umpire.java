package com.te.assignment;

public class Umpire {
	 int answer1;
	 int answer2;
	 int answer3;
	 int c;
	
	public void fail() {
		System.out.println("All guesses are incorrect so Please try again...");	
		again();
	}
     public int again() {
    	int b=0;
    	return b;	
	}
     public void decision() {
    	 if ((this.c == this.answer1) && (this.c == this.answer2) && (this.c == this.answer3)) {
			System.out.println("All the guesses are correct so game is tied.");
		}
    	 else if(this.c == this.answer1) {
    		 System.out.println("Player1 is winner");
    	 }
    	 else if(this.c == this.answer2) {
    		 System.out.println("Player2 is winner");
    	 }
    	 else if(this.c == this.answer3) {
    		 System.out.println("Player3 is winner");
    	 }
     }
}
		
	
     

