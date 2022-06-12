package W4;
import java.util.Scanner;
public class basamakSayilariToplamaOdevi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sayiyi Giriniz : ");
        int number = input.nextInt();
        int basNumber= 0;
        int total = 0;

            while (number != 0) {
            total += (number%10);
            number /= 10;
            ++basNumber;
             }
        System.out.println("Basamak Sayisi : " + basNumber);
        System.out.println("Toplam : " + total);
    }
}
