package Stream;

import java.io.*;

public class FilterStreamExample {
	public static void main(String[] args) {
		FileReader input = null;
		FileWriter output = null;
		BufferedReader bufInput = null;
		BufferedWriter bufOutput = null;
		try {
			String inFile = "in.txt";
			String outFile = "out2.txt";

			input = new FileReader(inFile);
			output = new FileWriter(outFile);
			bufInput = new BufferedReader(input);
			bufOutput = new BufferedWriter(output);

			String line;
			line = bufInput.readLine();
			while ( line != null ) {
				bufOutput.write(line, 0, line.length());
				bufOutput.newLine();
				line = bufInput.readLine();
				System.out.println("확인");
			}
			System.out.println(inFile + " >> " + outFile);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bufInput != null)
				try {bufInput .close();} catch (IOException e) {}
			if(bufOutput != null)
				try {bufOutput.close();} catch (IOException e) {}
		}
	}
}