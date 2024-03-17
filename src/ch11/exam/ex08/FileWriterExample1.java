package ch11.exam.ex08;

import java.io.IOException;

public class FileWriterExample1 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter ("file.txt");
			fw.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
