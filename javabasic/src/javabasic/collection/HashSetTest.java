package javabasic.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		// HashSet 생성
		Set<String> nameSet = new HashSet<String>();
		
		// 요소 추가
		nameSet.add("홍길동");
		nameSet.add("이순신");
		nameSet.add("강감찬");
		System.out.println(nameSet);
		
		// 컬렉션 추가
		Set<String> subSet = new HashSet<String>();
		subSet.add("장보고");
		subSet.add("권율");
		nameSet.addAll(subSet);
		System.out.println(nameSet);
		
		// 요소 포함 여부
		System.out.println(nameSet.contains("장보고"));
		
		// 셋이 비어있는지
		System.out.println(nameSet.isEmpty());
		
		// 요소 제거
		nameSet.remove("권율");
		System.out.println(nameSet);
		
		// 요소 개수
		System.out.println(nameSet.size());
		
		// Object[]로 변경
		Object[] objArr = nameSet.toArray();
		for (Object obj : objArr) {
			System.out.println(obj);
		}
		
		// Set은 중복 불허
		nameSet.add("홍길동");
		System.out.println(nameSet);
		
		
	} // main

} // class























