import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18;
        Scanner s= new Scanner(System.in);
        System.out.println("Ucret Tutarini Giriniz: ");
        tutar=s.nextDouble();
        double kdvTutar= tutar*kdvOran;
        double kdvliTutar= tutar+kdvTutar;
        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV Orani: "+kdvOran);
        System.out.println("KDV Tutar: "+kdvTutar);
        System.out.println("KDV'li Tutar: "+kdvliTutar);
    }
}
