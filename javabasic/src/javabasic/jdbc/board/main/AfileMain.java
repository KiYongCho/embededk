package javabasic.jdbc.board.main;

import javabasic.jdbc.board.service.AfileService;
import javabasic.jdbc.board.service.impl.AfileServiceImpl;

public class AfileMain {
	
	public static void main(String[] args) {

		AfileService afileService = new AfileServiceImpl();
		
		// System.out.println(afileService.listAfile());
		
		// System.out.println(afileService.getAfile(14));
		
		// afileService.registAfile(new Afile(0, "서버파일명", "클라이언트파일명", null, "N", 1));
		
		// afileService.modifyAfile(new Afile(21, "뉴서버파일명", "뉴클라이언트파일명", null, "Y", 1));
		
		afileService.removeAfile(21);
		
	}

}
