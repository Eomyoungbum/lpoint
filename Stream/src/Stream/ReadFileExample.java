package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileExample {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis  = new FileInputStream("in.txt");

			byte[] buffer = new byte[256];

			int readCount = fis.read(buffer);

			while(readCount != -1) {
				String data = new String(buffer,0,readCount);
				System.out.println(data);
				readCount = fis.read(buffer);
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일없음");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(fis!=null)
				try {fis.close();} catch(Exception e) {}
		}

	}
}