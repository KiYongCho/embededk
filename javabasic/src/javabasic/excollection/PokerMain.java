package javabasic.excollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerMain {

	public static void main(String[] args) {
		
		// 플레이어를 5명 만든다
		List<Player> playerList = new ArrayList<Player>();
		playerList.add(new Player("홍길동", Collections.EMPTY_LIST));
		playerList.add(new Player("이순신", Collections.EMPTY_LIST));
		playerList.add(new Player("강감찬", Collections.EMPTY_LIST));
		playerList.add(new Player("권율", Collections.EMPTY_LIST));
		playerList.add(new Player("최영", Collections.EMPTY_LIST));
		
		// 카드를 52장 만든다 (S2~S14, D2~D14, H2~H14, C2~C14)
		List<Card> totalCardList = new ArrayList<Card>();
		
		List<String> shapeList = new ArrayList<String>();
		shapeList.add("S"); shapeList.add("D");
		shapeList.add("H"); shapeList.add("C");
		
		for (int i=0; i<shapeList.size(); i++) {
			for (int j=2; j<15; j++) {
				totalCardList.add(new Card(j, shapeList.get(i)));
			}
		}
		System.out.println(totalCardList);
		
		// 카드를 섞자
		Collections.shuffle(totalCardList);
		System.out.println(totalCardList);
		
		// 플레이어들에게 7장씩 나눠준다
		// List 인터페이스에 List<E> subList(int fromIndex, int toIndex) 메소드
		for (int i=0; i<playerList.size(); i++) {
			playerList.get(i).setCardList(totalCardList.subList(i*7, (i*7)+7));
		}
		
		// 플레이어의 숫자카운트맵, 무늬카운트맵을 초기화하고 값을 설정
		for (int i=0; i<playerList.size(); i++) {
			
			// 플레이어의 숫자카운트맵, 무늬카운트맵을 생성
			Player player = playerList.get(i);
			player.setNumCountMap(new HashMap<Integer, Integer>());
			player.setShapeCountMap(new HashMap<String, Integer>());
			
			// 플레이어의 숫자카운트맵, 무늬카운트맵을 초기화
			initMap(player.getNumCountMap(), player.getShapeCountMap());
			
			// 카드의 숫자, 무늬 카운팅
			for (Card card : player.getCardList()) {
				player.getNumCountMap().put(card.getNum(), 
						player.getNumCountMap().get(card.getNum()) + 1);
				player.getShapeCountMap().put(card.getShape(), 
						player.getShapeCountMap().get(card.getShape()) + 1);
			}
		}
		
		for (Player player : playerList) {
			System.out.println(player);
		}
		
	} // main
	
	// 플레이어의 숫자카운트맵, 무늬카운트맵을 초기화 메소드
	private static void initMap(Map<Integer, Integer> numCountMap, 
			Map<String, Integer> shapeCountMap) {
		for (int i=2; i<15; i++) {
			numCountMap.put(i, 0);
		}
		shapeCountMap.put("S", 0);
		shapeCountMap.put("D", 0);
		shapeCountMap.put("H", 0);
		shapeCountMap.put("C", 0);
	}
	
} // class













