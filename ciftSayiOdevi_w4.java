package W4;

import java.util.Scanner;

public class ciftSayiOdevi_w4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int data, times = 0, plus = 0, toplam;
        double average;

        System.out.print("Lutfen sayiyi giriniz : ");
        data = input.nextInt();

        for (int start = 0; start <= data; start++){

            if ((start % 3 == 0) && (start % 4 ==0)){
                times++;
                System.out.println(start);
                plus += start;
            }

        }
        average= plus/times;
        System.out.println("Ortalama : "+average);
    }
}
