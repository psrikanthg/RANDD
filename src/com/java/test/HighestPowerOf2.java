package com.java.test;

public class HighestPowerOf2 {
	
	public static void main(String args[]) {
		
		HighestPowerOf2 main = new HighestPowerOf2();
		System.out.println(main.solution(24));
		
		System.out.println(Math.sqrt(10));
	}
	
	public int solution(int N) {
		
		 int result = 0;
			for (int i = 0; i < N / 2; i++) {
				int num = caculatePower(i);
				if (N % num == 0) {
					result = i;
				}
			}
			return result;
	}
	
	private int caculatePower(final int index) {
		Double d = new Double(Math.pow(2, index));
		return d.intValue();
	}

}
