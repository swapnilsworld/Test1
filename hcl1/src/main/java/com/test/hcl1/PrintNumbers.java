package com.test.hcl1;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isFirst = true;
		for(int i=1; i<11; i++) {
			if(isFirst) {
				System.out.print(i);
				isFirst = false;
			}
			else {
				System.out.print(", " +i);

			}
		}
	}

}
