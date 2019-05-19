package Stream;

import java.io.*;

public class ReadCustomerExample {

	public static void main(String [] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("customer.ser");
			ois = new ObjectInputStream(fis);

			Customer cust1 = (Customer)ois.readObject();
			Customer cust2 = (Customer)ois.readObject();
			System.out.println(cust1.toString());
			System.out.println(cust2.toString());

		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if(ois!=null)
				try { ois.close(); } catch (IOException e) { }
		}}}