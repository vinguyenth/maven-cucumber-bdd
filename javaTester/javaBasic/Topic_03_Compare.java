package javaBasic;

public class Topic_03_Compare {
	int number=8;

	public static void main(String[] args) {
		// 1 vùng nhớ cho biến x
		int x = 5;

		// 1 vùng nhớ cho biến y
		int y = x;

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		y=10;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		Topic_03_Compare firstVariable = new Topic_03_Compare();
		Topic_03_Compare secondVaribale = firstVariable;
//		Topic_03_Compare secondVaribale = new firstVariable;
		
		System.out.println("Before=" + firstVariable.number);
		System.out.println("Before=" + secondVaribale.number);
		
		secondVaribale.number=15;

		System.out.println("After=" + firstVariable.number);
		System.out.println("After=" + secondVaribale.number);

	}

}
