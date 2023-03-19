import  java.util.Scanner;
public class DersOrt {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz: ");
        Matematik = input.nextInt();
        System.out.print("Fizik Notunu Giriniz: ");
        Fizik = input.nextInt();
        System.out.print("Türkçe Notunu Giriniz: ");
        Turkce = input.nextInt();
        System.out.print("Kimya Notunu Giriniz: ");
        Kimya = input.nextInt();
        System.out.print("Müzik Notunu Giriniz: ");
        Muzik = input.nextInt();
        ortalama = (Matematik + Fizik + Turkce + Kimya + Muzik) / 5.0;
        if ((0 <= Matematik && Matematik <= 100) && (0 <= Fizik && Fizik <= 100) && (0 <= Turkce && Turkce <= 100) &&
             (0 <= Kimya && Kimya <= 100) && (0 <= Muzik && Muzik <= 100))
        {
           if (ortalama<=55){
               System.out.print("Sınıf Tekrarı.\nOrtalamanız: "+ ortalama);
           }
           else{
           System.out.print("Tebrikler Sınıfı Geçtiniz.\nOrtalamanız: "+ ortalama);}
        }
        else {
            System.out.print("1-100 arası değer giriniz.!!!");
        }

    }

}


