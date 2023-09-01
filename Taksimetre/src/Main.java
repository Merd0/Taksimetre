 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20,startPrice = 10, total ;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Kilometre Cinsinden Yazınız : ");
        km = input.nextInt();
        total =  (km * perKm);
        total += startPrice;
        total = ( total < 20 ) ? 20 : total;
        System.out.println("Toplam Tutarınız:" + total);
        System.out.print("İyi Günler!");
        }
    }
