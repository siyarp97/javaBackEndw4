package W4;
import java.util.Scanner;
public class tersUcgenOdevi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int i;
        int s;
        int k;
            //Kac satır istendiğinin değerini al
        System.out.print("Kac Satir Olsun? : ");
            n = input.nextInt();

            //Satırları alt alta sırala öncelikle.
        for (i= n-1; i>=0; i--){
            for (s=0; s<= n-i; s++){
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
