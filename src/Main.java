public class Main {
    public static void main(String[] args) {


        // Temel operatorler

        // Atama Operatoru

        // Temel Atama Operatoru ( = )

        int a = 5, b = 8; // 5 ve 8 degerlerini a ve b degiskenlerine atadik.
        int c = a + b; // a + b sonucunu c degiskenine atadik.
        System.out.println(a + " " + c);

        // Operatorun saginda ki degeri solunda ki deger ile toplayip tekrar solunda ki degere atayan operatordur. ( += )

        a += b;
        c += a;
        System.out.println(a + " " + c);

        // Operatorun saginda ki degeri solunda ki degerden cikartip tekrar solunda ki degere atayan operatordur. ( -= )

        a -= b;
        c -= a;
        System.out.println(a + " " + c);

        // Operatorun saginda ki degeri solunda ki deger ile carpip tekrar solunda ki degere atayan operatordur. ( *= )

        a *= b;
        c *= a;
        System.out.println(a + " " + c);

        // Operatorun saginda ki degeri solunda ki degere ile bolup tekrar solunda ki degere atayan operatordur. ( /= )

        a /= b;
        c /= a;
        System.out.println(a + " " + c);

        // Operatorun saginda ki degerin solunda ki ne gore modunu alip tekrar solunda ki degere atayan operatordur. ( %= )

        a %= b;
        c %= a;
        System.out.println(a + " " + c);

        // Aritmetik Operatorler
        // Java da aritmetik operatorler adindan da anlasilacagi uzre matematiksel islemleri programlama dilinde uygulamamizi saglar.

        c = a + b; // Toplama
        c = a - b; // Cikarma
        c = a * b; // Carpma
        c = a / b; // Bolme

        System.out.println("Aritmetik Operatorler : " + c);

    }
}