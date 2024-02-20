import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Merhabalar. Toplamak istedigin ilk degeri gir: ");
        int a = input.nextInt();

        System.out.print("Toplamak istedigin ikinci degeri gir:");
        int b = input.nextInt();

        System.out.println("Sonuc = " + (a + b));

    }
}