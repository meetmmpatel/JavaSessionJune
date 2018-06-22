package com.javasession.file.io;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File f = new File("src/com/javasession/file/io/input.txt");
		System.out.printf("The size of %1s is %2d bytes.%n", f.getName(), f.length());
		try {
			System.out.printf("The path is " + f.getName() + " is " + f.getCanonicalPath());
		} catch (Exception e) {
			System.out.println("An Exceptions");
		}

	}

}
