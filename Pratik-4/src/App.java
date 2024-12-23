import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz: ");
        int km= s.nextInt();
        double perKm= 2.20, total, startPrice= 10;
        total= km*perKm;
        total+= startPrice;
        total= (total<20) ? 20 : total;
        System.out.println("Toplam tutar: "+total);
    }
}
