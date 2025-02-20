
package average.calculatıon;

import java.util.Scanner;

public class AVERAGECALCULATION {

public static void main(String[] args) {
      // Değiişkeni tespit et.
      //Hesaplama yap.
      //Kouşullara Bak.
      //Sonucu ekrana yazdır.
      

// 1 - ogrenci vize final ve quiz olmak üzre 3 sınavdan olusan bir sisteme tabii tutlsun.
      // 2- vize yuzde 25 , quiz yuzde 15 , final yuzde 60 etkilesin.
      // 3- ortalaması 50nin altındaysa dersi geçemesin.
      // 4- 50ile 60 arasında ise şartlı geçsin.
      // 5- 60ve 100 arasındaysa başarılı olsun.
      /* KOD BAŞLASIN */
      
      System.out.println("hello student. Can you enter your midterm, final, and quiz scores in order?");
      Scanner input = new Scanner(System.in);
      double vize,fynal,quiz,ortalama ;
      ortalama=0.0;
      vize = input.nextDouble();
      fynal = input.nextDouble();
      quiz = input.nextDouble();
      
      ortalama=(25.0/100*vize)+(15.0/100*quiz)+(60.0/100*fynal);
      System.out.println("Your average score: " + ortalama);
      if ( ortalama <50){
          System.out.println("Fail");
      }
        else if (ortalama >= 50 && ortalama < 60) {
            System.out.println("Conditional Pass"); }
         else {
            System.out.println("Pass");}
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
