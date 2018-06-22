package com.javasession.file.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void main(String[] args) {
		InputStream is = null;
		int i;
		char c;
		// byte will convert values in to byte data type

		try {

			// new input stream created
			is = new FileInputStream("src/com/javasession/file/io/SomeInputFile.txt");

			System.out.println("Characters printed:");

			// reads till the end of the stream
			while ((i = is.read()) != -1) {

				// converts integer to character
				c = (char) i;

				// prints character
				System.out.print(c);
			}

		}
		catch (IOException e) {

			// if any I/O error occurs
			e.printStackTrace();
			System.out.println("An error occured");
		}
		finally {

			// releases system resources associated with this stream
			if (is != null)
				try {
					is.close();
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("An error occured while closing the stream");
				}
		}
	}

}
