package javabasic.exio;

import java.io.File;

public class ExFileTree {
	
	public static void main(String[] args) {
		printFileTree(new File("C:\\"));
	} // main
	
	private static void printFileTree(File file) {
		File[] files = file.listFiles();
		if (files!=null) {
			for (File f : files) {
				if (f.isDirectory()) {
					System.out.println("["+f.getName()+"] ");
					printFileTree(f);
				} else if (f.isFile()) {
					System.out.println("\t" + f.getName() + "(" + f.length() + ")");
				}
			}
		}
	}

} // class


















