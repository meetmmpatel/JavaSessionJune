package com.javasession.file.io;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ReaderDemo {
	public static void main(String[] args) {
		String s = "Hello World";

		// create a new StringReader
		Reader reader = new StringReader(s);

		try {

			for (int i = 0; i < s.length(); i++) {
				char c = (char) reader.read();
				System.out.print("" + c);
			}

			System.out.println();

			// close the stream
			reader.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
