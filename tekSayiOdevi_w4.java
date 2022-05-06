package W4;
import java.util.Scanner;
public class tekSayiOdevi_w4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int odd, total = 0;

        do {
            System.out.print("Sayiyi Giriniz : ");
            odd = input.nextInt();

            if (odd % 4 == 0){
                total += odd;
            }

        }while (odd % 2 != 1);

        System.out.println("Toplam : " + total);

    }

}
