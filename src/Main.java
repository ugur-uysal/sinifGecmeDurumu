import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, total, average = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik = input.nextInt();
        if (matematik < 0 || matematik > 100) {
            matematik = 0;
            average--;
        }

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            average--;
        }

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            average--;
        }

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            average--;
        }

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            average--;
        }

        total = matematik + fizik + turkce + kimya + muzik;

        if (total > 0 && total <= 500) {
            average = total / average;
            if (average < 55)
                System.out.println("Sınıfta KALDINIZ, seneye görüşmek üzere.");
            else
                System.out.println("Tebrikler, sınıfı geçtiniz.");

            System.out.print("Ortalamanız : " + average);

        } else
            System.out.println("Lütfen 0-100 arası değer giriniz !");
    }
}