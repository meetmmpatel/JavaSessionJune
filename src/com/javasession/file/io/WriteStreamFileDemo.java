package com.javasession.file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStreamFileDemo {
	

	public static void main(String[] args) {
		BufferedWriter bw = null;

		try {
			String mycontent = "This is java I/O content";
			String mycontent1 = "Secound line";
			File file = new File("myfile.txt");
			
			if (!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(mycontent);
			System.out.println("file was wirtten successfully!");

		}
		catch (IOException e) {
			System.out.println("Error while creating file");
		}
		finally{
			
			try {
				if (bw != null)
					bw.close();
				
			}
			catch (Exception e2) {
				System.out.println("Error while closing the BW ");
			}
			
		}

	}

}
