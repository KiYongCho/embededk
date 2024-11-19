package javabasic.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysTest {
	
	public static void main(String[] args) {
		
		Integer[] intArr1 = {10, 5, 9, 3, 1};
		
		// 배열을 리스트로 변환
		List<Integer> intList = Arrays.asList(intArr1);
		System.out.println(intList);
		
		Integer[] intArr2 = {1, 10, 5, 9, 3, 2, 7};
		
		// 배열 정렬
		Arrays.sort(intArr2, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});
		for (Integer i : intArr2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 배열 비교 (앞이 크면 양수, 같으면 0, 뒤가 크면 음수)
		System.out.println(Arrays.compare(intArr1, intArr2));
		
		// 배열 카피 (개수만큼)
		Integer[] intArr3 = Arrays.copyOf(intArr2, 3);
		for (Integer i : intArr3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 배열 카피 (범위만큼)
		Integer[] intArr4 = Arrays.copyOfRange(intArr2, 1, 4);
		for (Integer i : intArr4) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 배열 채우기
		Integer[] intArr5 = new Integer[5];
		Arrays.fill(intArr5, 3);
		for (Integer i : intArr5) {
			System.out.print(i + " ");
		}
		
	} // main

} // class

















