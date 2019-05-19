package Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StringInputExample {

	public static void main(String[] args) {
		String outFile = "out3.txt";
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		String inputString;
		System.out.println("저장할 내용을 입력 후 Ctrl+z를 눌러주세요.");
		
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			fos = new FileOutputStream(outFile);
			osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
			
			while((inputString = br.readLine()) != null) {
				bw.write(inputString+"\n");
			}
		}catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(br!=null) 
				try {br.close();}catch(IOException e) {}
			if(bw!=null)
				try {bw.close();}catch(IOException e) {}
		}

	}

}
