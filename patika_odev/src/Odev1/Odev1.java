package Odev1 ;
import java.util.Scanner;
public class Odev1 {

      public static void m5ain(String[]args){
      Scanner inp=new Scanner(System.in);
      int mat,tarih,kimya,turkce,fizik;  //degisken tanimlama
      //kullanicidan deger alma

      System.out.println("Matematik sınav notunuzu giriniz");
      mat=inp.nextInt();
      boolean sonuc1= mat>60;
      String str1=(sonuc1)?"Geçtiniz":"Kaldınız";
      System.out.println(str1);

      System.out.println("Tarih sınav notunuzu giriniz");
      tarih=inp.nextInt();
      boolean sonuc2= tarih>60;
      String str2=(sonuc2)?"Geçtiniz":"Kaldınız";
      System.out.println(str2);

      System.out.println("Kimya sınav notunuzu giriniz");
      kimya=inp.nextInt();
      boolean sonuc3= kimya>60;
      String str3=(sonuc3)?"Geçtiniz":"Kaldınız";
      System.out.println(str3);

      System.out.println("Türkçe sınav notunuzu giriniz");
      turkce=inp.nextInt();
      boolean sonuc4= turkce>60;
      String str4=(sonuc4)?"Geçtiniz":"Kaldınız";
      System.out.println(str4);

      System.out.println("Fizik sınav notunuzu giriniz");
      fizik=inp.nextInt();
      boolean sonuc5= fizik>60;
      String str5=(sonuc5)?"Geçtiniz":"Kaldınız";
      System.out.println(str5);
  }


}
