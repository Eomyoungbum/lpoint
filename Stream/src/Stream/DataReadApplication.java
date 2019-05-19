package Stream;

import java.io.*;
public class DataReadApplication {
    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("customer.data");
            dis = new DataInputStream(fis);
            String name = null;
            while( (name = dis.readUTF()) != null ){
                System.out.print(name);
                System.out.print(dis.readChar());
                System.out.print(dis.readUTF());
                System.out.println(dis.readInt());
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            if(dis!=null) try { dis.close(); } catch(Exception e) {} 
        }
    }
}
