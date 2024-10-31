package javabasic;

public class Operator {
	
	public static void main(String[] args) {
		
		// 단항연산자
		int i1 = 5;
		int j1 = -i1;
		
		int i2 = ++i1; // 전치연산자 : i1의 값을 1 증가시킨 후 결과를 i2에 대입 
		int i3 = i1++; // 후치연산자 : i1의 값을 i2에 대입시킨 후 i1의 값을 1 증가시킴
		System.out.println(i2); // 6
		System.out.println(i3); // 6
		
		// 삼항연산자
		int i4 = 5;
		int j2 = i4>5 ? 1 : 2;
		System.out.println(j2); // 2
		
		// 비트연산자
		byte b1 = 3; // 00000011
		byte b2 = ~(byte)3; // 비트반전 : 00000011 > 11111100
		System.out.println(b2); // -4
		byte b3 = 5; // 00000101
		byte b4 = 3|5; // 00000011 | 00000101 => 00000111
		System.out.println(b4); // 7
		byte b5 = 3&5; // 00000011 & 00000101 => 00000001
		System.out.println(b5); // 1
		byte b6 = 3^5; // 00000011 ^ 00000101 => 00000110
		System.out.println(b6); // 6
		
		// 쉬프트 연산자
		byte b7 = 5; // 00000101
		byte b8 = 5 >> 3; // 00000101 > 00000000 (비트를 오른쪽으로 3만큼 이동시키고 나머지는 0으로 채움)
		System.out.println(b8); // 0
		byte b9 = 5 >>> 3; // 00000101 > 00000000 (비트를 오른쪽으로 3만큼 이동시키고 나머지를 부호비트로 채움)
		System.out.println(b9); // 0
		
		// 양수 > 음수로 변환하려면 비트를 전부 반전시키고 1을 더함
		byte b10 = (byte)(-5 >>> 3); // 11111011 > 11111111
		System.out.println(b10); // -1
		
		byte b11 = (byte)(3 << 2); // 00000011 > 00001100 // 3을 2칸 왼쪽으로 이동시키고 0으로 채움
		System.out.println(b11); // 12
		
		// 나머지 연산자
		int i5 = 7;
		int j5 = 3;
		System.out.println(i5 % j5); // 1
		
		// 관계 연산자
		int i6 = 10;
		int j6 = 5;
		System.out.println(i6 == j6); // false
		System.out.println(i6 != j6); // true
		System.out.println(i6 > j6); // true
		System.out.println(i6 >= j6); // true
		System.out.println(i6 < j6); // false
		System.out.println(i6 <= j6); // false
		
		// 논리 연산자
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(!bool1); // false
		System.out.println(bool1 & bool2); // false
		System.out.println(bool1 | bool2); // true
		
		// 논리 연산자 &&, ||
		int i7 = 10;
		int j7 = 5;
		// && 연산자는 앞의 결과가 false이면 뒤의 연산을 수행하지 않음
		// => 논리곱 연산이기 때문에 앞의 결과가 false이면 뒤의 연산을 수행할 필요가 없다
		// => 어차피 전체결과가 false
		if (i7>10 && j7 <10) {
			System.out.println("i7은 j7 보다 큽니다!");
		}
		// || 연산자는 앞의 결과가 true이면 뒤의 연산을 수행하지 않음
		// => 논리합 연산이기 때문에 앞의 결과가 true이면 뒤의 연산을 수행할 필요가 없다
		// => 어차피 전체결과가 true
		
		// 대입 연산자
		int i8 = 5;
		int i9 = 3;
		i9 += i8; // i9 = i9 + i8;
		System.out.println(i9);
		int i10 = 7;
		int i11 = 3;
		i10 %= i11; // i10 = i10 % i11;
		System.out.println(i10);
		
		// 연산자 우선순위
		// 2 * 3 > 1 + 6 > 7 - 1 > i12 = 6
		int i12 = 1 + 2 * 3 - 1; // ()가 연산자 우선순위가 가장 높다. 대입연산자가 우선순위가 가장 낮다.
		
	}

}









