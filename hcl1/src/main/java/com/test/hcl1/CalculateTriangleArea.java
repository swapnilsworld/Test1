package com.test.hcl1;

public class CalculateTriangleArea {

	public static void main(String[] args) {
		//Area of triangle  = l*b/2
		Double l, b, area;
		
		if(args.length != 2) {
			System.out.println("Please enter base and height in arguments");
			System.exit(0);
		}
		
		l = Double.parseDouble(args[0]);
		b = Double.parseDouble(args[1]);
		
		area = calculateArea(l, b);


		System.out.println("Area of a triangle="+area);
	}

	private static Double calculateArea(Double l, Double b) {
		// TODO Auto-generated method stub
		return 	l * b / 2;

	}

}
