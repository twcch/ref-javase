package com.twcch.course.inheritance;

public class Main {

	public static void main(String[] args) {

		SuperClass[] scs = new SuperClass[] { new SubClass(1, 2, 3, 4), new SubSubClass(9, 8, 7, 6) };
		
		System.out.println("SubClass Object: " + scs[0].a);
		System.out.println("SubClass Object: " + scs[0].b);
		System.out.println("SubClass Object: " + scs[0].c);
		System.out.println("SubSubClass Object: " + scs[1].a);
		System.out.println("SubSubClass Object: " + scs[1].b);
		System.out.println("SubSubClass Object: " + scs[1].c);
		
		scs[0].superHello();
		
		SubClass sc = (SubClass) scs[0]; // 類別的轉型需要有直接繼承關係
		sc.subHello(); // SuperClass 類別無法調用 SubClass 的方法，必須先作向下轉型
		
	}

}
