package Stream;

import java.io.*;

public class WriteCustomerExample {
	public static void main(String [] args) {
		Customer cust1 = new Customer("홍길동", 'M', "hkd@test.com", 30);
		Customer cust2 = new Customer("홍길남", 'F', "hkn@test.com", 25);

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("customer.ser");
			oos = new ObjectOutputStream(fos);

			oos.writeObject(cust1);
			oos.writeObject(cust2);
			System.out.println("Customer 데이터가 저장되었습니다.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if(oos!=null)
				try { oos.close(); } catch (IOException e) { }
		}

	}
}
