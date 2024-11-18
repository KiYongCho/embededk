package javabasic.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		// HashMap 생성
		Map<Integer, String> stdMap = new HashMap<Integer, String>();
		
		// 엔트리 추가
		stdMap.put(1, "홍길동");		
		stdMap.put(2, "강감찬");		
		stdMap.put(3, "이순신");
		System.out.println(stdMap);
		
		// 키 포함 여부
		System.out.println(stdMap.containsKey(1));
		
		// 값 포함 여부
		System.out.println(stdMap.containsValue("유관순"));
		
		// 키에 해당하는 값 반환
		System.out.println(stdMap.get(3));
		
		// 엔트리가 없는지
		System.out.println(stdMap.isEmpty());
		
		// 맵을 추가
		Map<Integer, String> subMap = new HashMap<Integer, String>();
		subMap.put(3, "뉴이순신"); // 3키가 있으면 대체
		subMap.put(4, "유관순");
		subMap.put(5, "권율");
		stdMap.putAll(subMap);
		System.out.println(stdMap);
		
		// 키에 해당하는 엔트리 제거
		stdMap.remove(1);
		System.out.println(stdMap);
		
		// 맵의 엔트리 수
		System.out.println(stdMap.size());
		
		// 모든 엔트리 제거
		subMap.clear();
		System.out.println(subMap);
		
		// 엔트리 셋
		Set<Map.Entry<Integer, String>> entrySet = stdMap.entrySet();
		// 엔트리 셋을 반복시키기 위한 반복자
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		// 반복시킬것이 있는 동안 반복
		while (it.hasNext()) {
			// 셋에서 하나씩 꺼냄
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		// 키 셋
		Set<Integer> keySet = stdMap.keySet();
		Iterator<Integer> it2 = keySet.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		// 값 셋
		Collection<String> valColl = stdMap.values();
		Iterator<String> it3 = valColl.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}		
		
	} // main

} // class



















