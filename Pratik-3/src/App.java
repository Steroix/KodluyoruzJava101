import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int a,b;
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Kenari Giriniz:  ");
        a = sc.nextInt();
        System.out.println("2. Kenari Giriniz:  ");
        b = sc.nextInt();
        c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs: " + c);
    }
}
