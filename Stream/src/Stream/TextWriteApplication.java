package Stream;

import java.io.FileOutputStream;

public class TextWriteApplication {

    public static void main(String[] args) {
        String data1 = "홍길동,M,hkd@test.com,30"; 
        String data2 = "길남,F,hkn@test.com,25"; //필드구분자추가
        String data3 = "엄영범,M,gctserf,19";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("customer.txt");
            fos.write(data1.getBytes());
            fos.write('\n');//레코드 구분자 추가
            fos.write(data2.getBytes());
            fos.write('\n');
            fos.write(data3.getBytes());
            System.out.println("File saved");
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            if(fos!=null) try { fos.close(); } catch(Exception e) {}
        }
    }
}