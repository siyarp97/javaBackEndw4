package W4;
import java.util.Scanner;
public class faktoriyelOdevi_w4 {
    public static void main(String[] args) {

        int n, r, j, comb, total=1, total2=1, total3=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen kumenin eleman sayisıni giriniz (n) : ");
        n = input.nextInt();
        System.out.print("Secim sayisini giriniz (r) : ");
        r = input.nextInt();
        j=n-r;


                int i, k, m;
                    for (k=1; k<=n; k++){
                        total *= k;
                        //System.out.println(total);
                    }

                    for (i=1; i<=r; i++){
                            total2 *= i;
                            //System.out.println(total2);
                        }

                    for (m=1; m<=j;m++){
                        total3 *= m;
                        //System.out.println(total3);
                    }


        comb = total / (total2 * total3);
        System.out.println("Kombinasyon : " + comb);


    }

}

