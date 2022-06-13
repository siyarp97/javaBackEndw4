
package W4;

import java.util.Scanner;

public class elmasOdevi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac Tekrar Olsun? : ");
        int n = input.nextInt();
        //bu kısıma kadar standart işlemler yaptık.



        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

                    //Sınır

        for (int i = n; i>=0 ; i--) {
            for (int j = 0; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
