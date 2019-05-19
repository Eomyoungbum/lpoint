package web;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WebData {
   public static void main(String[] args) throws InterruptedException{
      FileWriter fw=null;
      while(true) {
          try {
           Document doc = Jsoup.connect("http://www.betman.co.kr/main.so").get();
           String link = doc.select(".m0201").toString();
           String link2 = "http://www.betman.co.kr/"+link.split("\"")[1];
           doc = Jsoup.connect(link2).get();
           link = doc.select("strong").toString();
           link2 = doc.select(".end").toString();
           Elements e = doc.select("strong");
           int i=0;
           for(Element el : e) {
        	   i++;
        	   if(el.toString().contains("승부식")) {
        		  break;
        	   }
           }
           if(i==1||i==3) {
        	   link = "http://www.betman.co.kr/"+link2.split("\"")[3];  
           }else if(i==2||i==4) {
        	   link = "http://www.betman.co.kr/"+link2.split("\"")[11];
           }
           System.out.println(link);
           doc = Jsoup.connect(link).get();
           String fullData = doc.select("#SLIPAREA").toString();
           Date time =  new Date();
            String fileName =(time.getYear()+1900)+"년"+(time.getMonth()+1)+"월"+time.getDate()+"일"+time.getHours()+"시"+time.getMinutes()+"분"+time.getSeconds()+"초의 실시간검색어.txt";
//            System.out.println(fileName);
            fw = new FileWriter(fileName);
            fw.write(fullData);
          }catch(IOException e) {
        e.printStackTrace();
          }finally {
          Thread.sleep(60000);
          }
       }        
   }
}
