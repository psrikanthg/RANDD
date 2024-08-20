package com.java.swtich;

public class SwitchExample {
	
	enum Roman {A, B, C, D, E, F};
        
	
	public static void main(String... args){
		
		int x=7;
		int z=2;
		Roman r = Roman.C;
		do{
			switch(r){
			   
			case A: r = Roman.C; break;
			case C:  if(r.ordinal() >2) z+=5;
			default: x++;
			case E: r= Roman.F;
			}
			z++;
		}while (x<10);
		
			System.out.println(z);
	}
}
