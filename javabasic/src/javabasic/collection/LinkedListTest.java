package javabasic.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		// LinkedList 생성
		List<Integer> intList = new LinkedList<Integer>();
		
		// 요소 추가
		intList.add(1);
		intList.add(2);
		intList.add(3);
		((LinkedList)intList).addFirst(0); // 첫번째 요소 추가
		((LinkedList)intList).addLast(4); // 마지막 요소 추가
		System.out.println(intList);
		
		// 첫번째 요소 가져오기 (꺼내진 않고)
		System.out.println(((LinkedList)intList).peek());
		System.out.println(intList);
		
		// 첫번째 요소 가져오기 (꺼냄)
		System.out.println(((LinkedList)intList).pop());
		System.out.println(intList);
		
		// 첫번째 요소 추가
		((LinkedList)intList).push(5);
		System.out.println(intList);
		
		// 요소 제거
		intList.remove(1);
		System.out.println(intList);
		((LinkedList)intList).removeFirst();
		System.out.println(intList);
		((LinkedList)intList).removeLast();
		System.out.println(intList);
		
	} // main

} // class


























