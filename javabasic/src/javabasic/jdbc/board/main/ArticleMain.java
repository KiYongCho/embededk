package javabasic.jdbc.board.main;

import javabasic.jdbc.board.service.ArticleService;
import javabasic.jdbc.board.service.impl.ArticleServiceImpl;

public class ArticleMain {
	
	public static void main(String[] args) {
		
		ArticleService articleService = new ArticleServiceImpl();
		
		// System.out.println(articleService.listArticle());
		
		// System.out.println(articleService.getArticle(1));
		
//		articleService.registArticle(
//				new Article(0, "제목", "내용", null, 0, 0, "N", "HONG", 1)
//		);
		
//		articleService.modifyArticle(
//			new Article(21, "새제목", "새내용", null, 0, 0, "Y", "HONG", 1)
//		);
		
		articleService.removeArticle(21);
		
	}

}







