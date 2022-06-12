package W4;
import java.util.Scanner;
public class usHesabiOdevi_w4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long a,b;

        System.out.print("Ussu alinacak sayiyi giriniz : ");
        a = input.nextInt();
        System.out.print("Kac kere us alacaginizi giriniz : ");
        b=input.nextInt();

        long total=1;
        for (long i =1; i<=b; i++){
            total *= a;
        }

        System.out.print("Sonuc : " + total);

    }

}
