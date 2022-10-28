import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int sayi;
    public static String tersi = "";
    public static int basamak = 0;
    public static int sayac = 1;
    public static int mod = 1;

    static void isPalindrom(int i) {
        if (i >=10) {
            basamak = i / 10;
            sayac++;
            while (basamak >= 10) {
                basamak = basamak / 10;
                sayac++;
            }
        }
        for (int ab = 0; ab < sayac; ab++){
            mod = i % 10;
            i = i / 10;
            tersi += Integer.toString(mod);
            mod = 0;
        }
        if (sayi == Integer.parseInt(tersi)){
            System.out.println("Palindrom Sayıdır");
        }
        else {
            System.out.println("Palindrom Sayı Değildir");
        }
    }


    public static void main(String[] args) {
        System.out.println("Sayıyı Giriniz: ");
        sayi = input.nextInt();
        isPalindrom(sayi);
    }
}
