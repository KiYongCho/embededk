package javabasic.excollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PokerRule {
	
	// 로얄스트레이트플러시 여부 : 연속된 5개의 숫자(10~14)이고 5개가 동일한 무늬
	public static boolean isRoyalStraightFlush(Player player) {
		return isRoyalStraight(player) && isFlush(player);
	}
	
	// 스트레이트플러시 여부 : 연속된 5개의 숫자이고 5개가 동일한 무늬, 로얄 제외
	public static boolean isStraightFlush(Player player) {
		return !isRoyalStraight(player) && isStraight(player) && isFlush(player);
	}
	
	// 포카드 여부 : 4개의 숫자가 동일 (구현)
	public static boolean isFourCard(Player player) {
		Set<Integer> keySet = player.getNumCountMap().keySet();
		Iterator<Integer> it = keySet.iterator();
		while (it.hasNext()) {
			if (player.getNumCountMap().get((Integer)it.next())==4) return true;
		}
		return false;
	}
	
	// 풀하우스 여부 : 트리플 + 트리플 또는 트리플 + 원페어 또는 트리플 + 투페어
	public static boolean isFullHouse(Player player) {
		if (numOfTriple(player)==2
			|| (numOfTriple(player)==1 && numOfPair(player)==1)
			|| (numOfTriple(player)==1 && numOfPair(player)==2)) {
			return true;
		}
		return false;
	}
	
	// 플러시 여부 : 동일한 무늬 5개 이상 (구현)
	public static boolean isFlush(Player player) {
		Set<String> keySet = player.getShapeCountMap().keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			if (player.getShapeCountMap().get(it.next())>=5) return true;
		}
		return false;
	}	
	
	// 스트레이트 여부 : 연속된 번호가 5개 이상 (구현)
	public static boolean isStraight(Player player) {
		Set<Integer> keySet = player.getNumCountMap().keySet();
		Iterator<Integer> it = keySet.iterator();

		// 개수가 1개 이상인 번호들을 저장하는 리스트
		List<Integer> numList = new ArrayList<Integer>();
		while (it.hasNext()) {
			Integer num = (Integer)it.next();
			if (player.getNumCountMap().get(num)>=1) {
				numList.add(num);
			}
		}
		
		int numListSize = numList.size();
		if (numListSize>=5) {
			if (numListSize==5 && ((numList.get(numListSize-1)-numList.get(0))==4)) {
				return true;
			} else if (numListSize==6 &&
							((numList.get(numListSize-1)-numList.get(1)==4) ||
					  			(numList.get(numListSize-2)-numList.get(0)==4))) {
				return true;
			} else if (numListSize==7 &&
							((numList.get(numListSize-1)-numList.get(2)==4) ||
								(numList.get(numListSize-2)-numList.get(1)==4) ||
									(numList.get(numListSize-3)-numList.get(0)==4))) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}	
	
	// 트리플 여부 : 페어가 없는 동일한 숫자 3개
	public static boolean isTriple(Player player) {
		if (numOfPair(player)==0 && 
				numOfTriple(player)==1) return true;
		return false;
	}	
	
	// 투페어 여부 : 트리플이 없는 동일한 숫자 2개가 2개 이상
	public static boolean isTwoPair(Player player) {
		if (numOfTriple(player)==0 &&
				(numOfPair(player)==2 || numOfPair(player)==3)) return true;
		return false;
	}
	
	// 원페어 여부 : 트리플이 없는 동일한 숫자 2개가 1개
	public static boolean isOnePair(Player player) {
		if (numOfTriple(player)==0 &&
				numOfPair(player)==1) return true;
		return false;
	}
	
	// 페어수를 반환 (구현)
	public static int numOfPair(Player player) {
		Set<Integer> keySet = player.getNumCountMap().keySet();
		Iterator<Integer> it = keySet.iterator();
		int count = 0;
		while (it.hasNext()) {
			if (player.getNumCountMap().get((Integer)it.next())==2) count++;
		}
		return count;
	}	
	
	// 트리플수를 반환 (구현)
	public static int numOfTriple(Player player) {
		Set<Integer> keySet = player.getNumCountMap().keySet();
		Iterator<Integer> it = keySet.iterator();
		int count = 0;
		while (it.hasNext()) {
			if (player.getNumCountMap().get((Integer)it.next())==3) count++;
		}
		return count;
	}
	
	// 로열스트레이트 여부 반환 (10~14 연속된 숫자) (구현)
	public static boolean isRoyalStraight(Player player) {
		
		List<Integer> royalList = Arrays.asList(10, 11, 12, 13, 14);
		
		Set<Integer> keySet = player.getNumCountMap().keySet();
		Iterator<Integer> it = keySet.iterator();		
		
		// 개수가 1개 이상인 번호들을 저장하는 리스트
		List<Integer> numList = new ArrayList<Integer>();
		while (it.hasNext()) {
			Integer num = (Integer)it.next();
			if (player.getNumCountMap().get(num)>=1) {
				numList.add(num);
			}
		}		
		
		if (isStraight(player)) {
			return numList.containsAll(royalList);
		} else {
			return false;
		}
	}
	
} // class













