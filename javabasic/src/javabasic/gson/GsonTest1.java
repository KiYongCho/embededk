package javabasic.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

/*
	GSON
	- Google에서 만든 JSON Java library
	- 자바객체 <-> JSON 변환
	- JSON <-> 자바객체 변환
	- 비슷한 역할을 하는 라이브러리 Jackson, SimpleJSON
 */

public class GsonTest1 {
	
	public static void main(String[] args) {
		
		// Gson 객체 생성법 1) 기본생성자로 만들기
		Gson gson1 = new Gson();
		
		// Gson 객체 생성법 2) GsonBuilder로 만들기
		Gson gson2 = new GsonBuilder().create();
		
		// Gson 객체 생성법 3) GsonBuilder로 만들기 (정렬)
		// pretty printing : JSON문자열을 들여쓰기 해서 정렬해서 보여줌
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
		
		// JsonObject 객체 생성
		JsonObject jsonObject = new JsonObject();
		
		// JsonObject에 키/값 추가
		jsonObject.addProperty("name", "홍길동"); // {"name": "홍길동"} 형태의 Json객체
		jsonObject.addProperty("age", 30); // {"name": "홍길동", "age": 30} 형태의 Json객체
		
		// JsonObject를 Json 문자열로 변환
		// JSON객체는 JSON문자열을 가진 객체, JSON문자열은 JSON객체 형태의 문자열
		String jsonStr = gson3.toJson(jsonObject); // JSON객체 > JSON문자열
		System.out.println(jsonStr);
		
		// Java객체를 Json문자열로 변환
		// 프로그램에서 네트워크를 통해서 Java객체를 Json문자열로 변환해서 내보낼때 사용
		Person person = new Person("홍길동", 30);
		String personJsonStr = gson3.toJson(person); // Java객체 > JSON문자열
		System.out.println(personJsonStr);
		
		// Json문자열을 Java객체로 변환
		String jsonStr2 = "{\"name\":\"강감찬\", \"age\":30}";
		//System.out.println(jsonStr2);
		Person person2 = gson3.fromJson(jsonStr2, Person.class); // JSON문자열 > Java객체
		System.out.println(person2);
		
		// Map객체를 Json문자열로 변환
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "유관순");
		map.put("age", "20");
		map.put("gender", "여성");
		String mapStr = gson3.toJson(map); // Map객체를 JSON문자열로 변환
		System.out.println(mapStr);
		
		// Json문자열을 Map객체로 변환
		String jsonStr3 = "{\"name\":\"강감찬\", \"age\":\"30\"}";
		Map<String, String> map2 = gson3.fromJson(jsonStr3, Map.class);
		for (Map.Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		// List객체를 Json문자열로 변환
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("홍길동", 30));
		personList.add(new Person("강감찬", 40));
		personList.add(new Person("이순신", 50));
		String jsonStr4 = gson3.toJson(personList);
		System.out.println(jsonStr4);
		
		// Json문자열을 List객체로 변환
		// TypeToken을 사용하여 List<Person>의 타입을 명시적으로 정의
		List<Person> personList2 = gson3.fromJson(jsonStr4, List.class);
		for (int i=0; i<personList2.size(); i++) {
			System.out.println(personList2.get(i));
		}
		
	} // main

} // class































