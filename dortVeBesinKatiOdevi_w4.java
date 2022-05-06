package W4;
import java.util.Scanner;
public class dortVeBesinKatiOdevi_w4 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sinir Sayisini Giriniz : ");
        n = input.nextInt();

        System.out.println("\n4'un usleri:");
            for(int i=1; i <= n; i*=4){
            System.out.println(i);
            }

        System.out.println("\n5'in usleri:");
            for(int i=1; i <= n; i*=5){
            System.out.println(i);
            }


    }
}
