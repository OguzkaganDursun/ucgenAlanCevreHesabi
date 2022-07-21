import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        */

        // Degiskenler olusturuldu.
        int a, b, c;
        double u,cevre, alanKaresi, alan;
        //Kullanicidan veriler alindi.
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("Ucgende Alan Ve Cevre Hesaplama");
        System.out.println("-------------------------------");
        System.out.print("1. Kenari Giriniz : ");
        a = scan.nextInt();

        System.out.print("2. Kenari Giriniz : ");
        b = scan.nextInt();

        System.out.print("3. Kenari Giriniz : ");
        c = scan.nextInt();
        System.out.println("-------------------------------");

        //Alinan verilerle alan, cevre hesaplandi ve kullaniciya yeni bilgiler verildi.
        u = (a + b + c)/2;
        cevre =u*2;
        alanKaresi = u * (u-a) * (u-b) * (u-c);
        alan = Math.sqrt(alanKaresi);

        System.out.println("Ucgenin Cevresi : " + cevre);
        System.out.println("Ucgenin Alani : " + alan);



    }
}
