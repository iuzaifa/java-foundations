package exceptions;

import java.io.*;

public class Example1 {
    public static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt"); // might throw IOException
        BufferedReader fileInput = new BufferedReader(file);

        System.out.println(fileInput.readLine());
        fileInput.close();
    }

    public static void main(String[] args) {
        try {
            readFile(); // must handle the exception here
        } catch (IOException e) {
            System.out.println("File not found or error reading file: " + e.getMessage());
        }
    }
}
