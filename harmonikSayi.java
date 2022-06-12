package W4;
import java.util.Scanner;
public class harmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n'i Giriniz : ");
            double n = input.nextInt();
            double result = 0;

            while (n > 0){
                result += (1/n);
                n--;
            }
        System.out.print( "Sonuc : " + result);
    }
}
