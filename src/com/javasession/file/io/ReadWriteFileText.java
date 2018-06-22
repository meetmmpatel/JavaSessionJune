package com.javasession.file.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFileText {
static char[] chars;
    
    public static void main(String[] args) {
        String fileName = "src/com/javasession/file/io/ReadWritefiletext.txt";
        readFileIntoArray(fileName);
        String fileName2 = "src/com/javasession/file/io/NewReadWritefiletext.txt";
        writeArrayToFile(fileName2);
    }
    
    static void readFileIntoArray(String fn) {
        File f = new File(fn);
        long length = f.length();
        FileReader fr = null;

        try {
            fr = new FileReader(f);
            int intLength = (int)length;
            chars = new char[intLength];
            fr.read(chars); 
        }
        catch (IOException e) {
            System.err.println(e);
        }
        finally {
            try {
                fr.close();
            }
            catch (IOException e) {
                System.err.println(e);
            }
        }        
    }
    
    static void writeArrayToFile(String fn) {
        File f = new File(fn);
        FileWriter fw = null;

        try {
            fw = new FileWriter(f);
            fw.write(chars);            
        }
        catch (IOException e) {
            System.err.println(e);
        }
        finally {
            try {
                fw.close();
            }
            catch (IOException e) {
                System.err.println(e);
            }
        } 
    }

}
