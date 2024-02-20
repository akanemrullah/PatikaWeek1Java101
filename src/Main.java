import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Intiger islemleri

        System.out.print("Merhabalar. Toplamak istedigin ilk degeri gir: ");
        int a = input.nextInt();

        System.out.print("Toplamak istedigin ikinci degeri gir:");
        int b = input.nextInt();

        System.out.println("Sonuc = " + (a + b));

        // Double islemleri

        System.out.print("Sayi gir: ");
        double c = input.nextDouble();
        System.out.println("Girdiginiz sayi : " + c);

        // String islemleri

        System.out.println("Merhabalar. Isminizi giriniz lutfen : ");
        String d = input.nextLine();
        System.out.println("Hosgeldin " + d + " Iyi vakitler...");

    }
}