package javabasic.excollection;

import java.util.List;

public class PokerRule {
	
	// 로얄스트레이트플러시 여부 : 연속된 5개의 숫자(10~14)이고 5개가 동일한 무늬
	public static boolean isRoyalStraightFlush(List<Card> cardList) {
		return false;
	}
	
	// 스트레이트플러시 여부 : 연속된 5개의 숫자이고 5개가 동일한 무늬, 로얄 제외
	public static boolean isStraightFlush(List<Card> cardList) {
		return !isRoyalStraightFlush(cardList) && (isStraight(cardList) && isFlush(cardList));
	}
	
	// 포카드 여부 : 4개의 숫자가 동일
	public static boolean isFourCard(List<Card> cardList) {
		return false;
	}	
	
	// 풀하우스 여부 : 트리플 + 트리플 또는 트리플 + 원페어 또는 트리플 + 투페어
	public static boolean isFullHouse(List<Card> cardList) {
		if (numOfTriple(cardList)==2
			|| (numOfTriple(cardList)==1 && numOfPair(cardList)==1)
			|| (numOfTriple(cardList)==1 && numOfPair(cardList)==2)) {
			return true;
		}
		return false;
	}
	
	// 플러시 여부 : 동일한 무늬 5개 이상
	public static boolean isFlush(List<Card> cardList) {
		return false;
	}	
	
	// 스트레이트 여부 : 연속된 번호가 5개 이상
	public static boolean isStraight(List<Card> cardList) {
		return false;
	}	
	
	// 트리플 여부 : 동일한 숫자 3개
	public static boolean isTriple(List<Card> cardList) {
		if (numOfTriple(cardList)==1) return true;
		return false;
	}	
	
	// 투페어 여부 : 동일한 숫자 2개가 2개 이상
	public static boolean isTwoPair(List<Card> cardList) {
		if (numOfPair(cardList)==2||numOfPair(cardList)==3) return true;
		return false;
	}
	
	// 원페어 여부 : 동일한 숫자 2개가 1개
	public static boolean isOnePair(List<Card> cardList) {
		if (numOfPair(cardList)==1) return true;
		return false;
	}
	
	// 페어수를 반환
	public static int numOfPair(List<Card> cardList) {
		return 0;
	}	
	
	// 트리플수를 반환
	public static int numOfTriple(List<Card> cardList) {
		return 0;
	}
	
} // class













