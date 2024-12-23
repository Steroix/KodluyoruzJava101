import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s= new Scanner(System.in);
        int mat, fiz, kim, tur, tar, muz;
        System.out.println("Matematik notunuzu giriniz: ");
        mat = s.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fiz = s.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kim = s.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        tur = s.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tar = s.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muz = s.nextInt();
        int toplam = mat+fiz+kim+tur+tar+muz;
        double sonuc = toplam/6;
        System.out.println("Ortalamanız: "+sonuc);
        System.out.println(sonuc>=60?"Sinifi Geçtiniz":"Sinifta Kaldiniz");
        s.close();
    }
}
