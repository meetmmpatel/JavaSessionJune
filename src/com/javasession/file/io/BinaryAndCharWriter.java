package com.javasession.file.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;



public class BinaryAndCharWriter {

	private String firstName;
	private String lastName;
	private int empId;
	private boolean isActive;

	public BinaryAndCharWriter(String firstName, String lastName, int empId, boolean isActive) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.isActive = isActive;
	}

	public void writeBinary(OutputStream out) throws IOException {
		DataOutputStream dataOut = new DataOutputStream(out);
		dataOut.writeChars(firstName);
		dataOut.writeChars(lastName);
		dataOut.writeInt(empId);
		dataOut.writeBoolean(isActive);

	}

	public void writeText(Writer out) {

		PrintWriter printOut = new PrintWriter(out);
		printOut.println(firstName);
		printOut.println(lastName);
		printOut.println(empId);
		printOut.println(isActive);
	}

	public static void main(String[] args) throws IOException {
		BinaryAndCharWriter emp1 = new BinaryAndCharWriter("Mike", "Smith", 43234, true);
		BinaryAndCharWriter emp2 = new BinaryAndCharWriter("Jason", "Smith", 43235, false);
		BinaryAndCharWriter emp3 = new BinaryAndCharWriter("Paul", "Smith", 43236, true);

		try {
			FileOutputStream dat = new FileOutputStream("src/com/javasession/file/io/EmpBinary.txt");
			emp1.writeBinary(dat);
			emp2.writeBinary(dat);
			emp3.writeBinary(dat);
			dat.close();

			FileWriter txt = new FileWriter("src/com/javasession/file/io/Emp.txt");
			emp1.writeText(txt);
			emp2.writeText(txt);
			emp3.writeText(txt);
			txt.close();
			
			System.out.println("Requested Text has been printed to the file");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
