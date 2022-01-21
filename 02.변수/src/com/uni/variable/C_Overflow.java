package com.uni.variable;

public class C_Overflow {

	public void printVariableSize() {
		
//		System.out.println("byte의 크기"+ Byte.MAX_VALUE + "byte"); // 127
		
		System.out.println("byte의 크기  : "+ Byte.BYTES + "byte");
		System.out.println("short의 크기  : "+ Short.BYTES + "byte");
		System.out.println("int의 크기  : "+ Integer.BYTES + "byte");
		System.out.println("long의 크기  : "+ Long.BYTES + "byte");
		System.out.println("float의 크기  : "+ Float.BYTES + "byte");
		System.out.println("double의 크기  : "+ Double.BYTES + "byte");
		System.out.println("char의 크기  : "+ Character.BYTES + "byte");

		
	}
	
	public void overflow() {
		byte bNum = 127;
		System.out.println(bNum);
		
		
		byte result = (byte) (bNum + 3); // 130일거 같지만 // -128 -127 -126
		System.out.println("result : " + result); 
		
		int num1 = 1000000; 	// 100만
		int num2 = 700000; 		// 70만
		
		int result2 = num1 * num2; // 7조 //인트형으로 담았기 때문에 연산처리는 인트로 된거임.
		System.out.println("result2 : " + result2); //int 형으로 변환 되었다함
		
		long result3 = (long)num1 * num2; 	//이미 곱셈자체에서 int형으로 결과가 나오기 때문에 그 순간 이미 오버플로우 발생.
											//그래서 둘 중 하나라도 long 형으로 강제 형변환을 시켜줘야 한다.
		
											//결과를 long으로 해도 곱셈 자료형이 int라서 오버플로우 발생.
											//하나만 long으로 하고 곱하니까 long으로 변함.
		
		System.out.println("result3 : " + result3);

		int e = 6+9/(15/4)*(11-1)%(5+2);
		System.out.println(e);
	}
}
