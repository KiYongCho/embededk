package javabasic.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		// ArrayList 생성
		List<String> fruitList = new ArrayList<String>();
		
		// 요소 하나씩 추가
		fruitList.add("사과");
		fruitList.add("딸기");
		fruitList.add("포도");
		
		List<String> subList = new ArrayList<String>();
		subList.add("복숭아");
		subList.add("참외");
		
		// 컬렉션을 추가
		fruitList.addAll(subList);
		
		// 요소 모두 제거
		subList.clear();
		
		// 요소 포함여부 반환
		System.out.println(fruitList.contains("포도"));
		
		// 요소 획득
		System.out.println(fruitList.get(0));
		
		// 요소 인덱스 반환
		System.out.println(fruitList.indexOf("딸기"));
		
		// 요소가 없는지 확인
		System.out.println(fruitList.isEmpty());
		
		// 요소가 위치한 마지막 인덱스
		fruitList.add("포도");
		System.out.println(fruitList.lastIndexOf("포도"));
		
		// 요소 하나 제거
		fruitList.remove("딸기");
		System.out.println(fruitList);
		
		// 요소 모두 제거
		subList.add("복숭아");
		subList.add("참외");
		fruitList.removeAll(subList);
		System.out.println(fruitList);
		
		// 요소 변경
		fruitList.set(2, "복숭아");
		System.out.println(fruitList);
		
		// 요소 개수
		System.out.println(fruitList.size());
		
		// Object[]로 반환
		Object[] objArr = fruitList.toArray();
		for (Object obj : objArr ) {
			System.out.println(obj);
		}
		
	} // main

} // class
































