package javabasic.excollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonInfo1 {

	public static void main(String[] args) {
		
		System.out.println("이름과 나이 3개를 입력해 주세요! (형식:이름,나이)");
		
		Scanner scanner = new Scanner(System.in);
		
		Map<String, String> personMap = new HashMap<String, String>();
		
		for (int i=0; i<3; i++) {
			String input = scanner.next();
			String name = input.substring(0, input.indexOf(','));
			String age = input.substring(input.indexOf(',') + 1);
			personMap.put(name, age);
		}
		
		Set<Map.Entry<String, String>> entrySet =
				personMap.entrySet();
		
		Iterator<Map.Entry<String, String>> it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.printf("%s은 %s살\n", entry.getKey(), entry.getValue());
		}
		
		/* keySet() 사용
		Set<String> keySet = personMap.keySet();
		Iterator<String> it2 = keySet.iterator();
		while (it2.hasNext()) {
			String key = it2.next();
			System.out.printf("%s은 %s살\n", key, personMap.get(key));
		}
		*/
		
		scanner.close();
		
	} // main
	
} // class





















