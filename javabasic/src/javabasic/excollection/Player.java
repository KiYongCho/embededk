package javabasic.excollection;

import java.util.List;

public class Player {
	
	private String name;	// 이름
	private List<Card> cardList;	// 카드리스트
	
	public Player() {
	}

	public Player(String name, List<Card> cardList) {
		super();
		this.name = name;
		this.cardList = cardList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getCardList() {
		return cardList;
	}

	public void setCardList(List<Card> cardList) {
		this.cardList = cardList;
	}
	
	@Override
	public String toString() {
		return name + " " + cardList;
	}
	
}
