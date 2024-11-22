package javabasic.exio;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MemoMain {
	
	private static int memoNo = 0;
	private static Map<Integer, Memo> memoMap
		= new HashMap<Integer, Memo>();
	
	private static ObjectOutputStream oos = null;
	private static ObjectInputStream ois = null;
	
	public static void main(String[] args) {
		
		File file = new File("D:\\embededk\\files\\memo.dat");
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			ois = new ObjectInputStream(new FileInputStream(file));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		while (true) {
			System.out.println("\n번호를 입력해 주세요! (1.메모리스트 2.메모입력 3.메모삭제 4.종료)");
			switch(new Scanner(System.in).nextInt()) {
				case 1: printMemo(); break;
				case 2: addMemo(); break;
				case 3: deleteMemo(); break;
				case 4: System.out.println("종료!"); System.exit(0);
			}
		}
		
	}  // main
	
	private static Map<Integer, Memo> getMap() {
		try {
			memoMap = (HashMap<Integer, Memo>)ois.readObject();
		} catch (EOFException eofe) {
			// 무시
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} finally {
			return memoMap;
		}
	}
	
	private static void printMemo() {
		memoMap = getMap();
		if (!memoMap.isEmpty()) {
			Iterator it = memoMap.keySet().iterator();
			while (it.hasNext()) {
				System.out.println(memoMap.get(it.next()));
			}
		} else {
			System.out.println("등록된 메모가 없습니다!");			
		}
	}
	
	private static void addMemo() {
		System.out.println("메모내용을 입력해주세요!");
		memoMap.put(++memoNo, 
				new Memo(memoNo, new Scanner(System.in).nextLine()));
		updateFile();
	}
	
	private static void deleteMemo() {
		System.out.println("삭제하실 메모번호를 입력해주세요!");
		memoMap.remove(new Scanner(System.in).nextInt());
		updateFile();
	}
	
	private static void updateFile() {
		try {
			oos.writeObject(memoMap);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}		
		printMemo();			
	}

} // class

















