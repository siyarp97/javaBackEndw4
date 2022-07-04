package W4;
import java.util.Scanner;
import java.io.BufferedInputStream;
public class atmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;


        while (right > 0) {

                System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
                String id = input.next();
                System.out.print("Lutfen Sifrenizi Giriniz : ");
                String password = input.next();

                if (id.equals("patika") && password.equals("izmir")) {
                    System.out.println("Giris Yaptiniz! \n");



                    System.out.println("Hangi islemi yapmak istersiniz?\n" +
                            "1- Para Cekme\n" +
                            "2- Para Yatirma\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Cikis");

                    System.out.print("Yapmak istediginiz islemi tuslayiniz: ");
                    select = input.nextInt();

                    switch (select) {

                            case 1:
                                System.out.print("Cekmek istediginiz miktari tuslayiniz : ");
                                price = input.nextInt();

                                if (price > balance) {
                                    System.out.println("Bakiye Yetersiz");
                                } else {
                                    System.out.println("Kalan bakiyeniz : " + (balance -= price));
                                }
                                break;

                            case 2:
                                System.out.print("Ne kadar yatirmak istediginiz tuslayiniz : ");
                                price = input.nextInt();
                                System.out.println("Guncel Bakiyeniz : " + (balance += price));
                                break;

                            case 3:
                                System.out.println("Guncel bakiyeniz : " + balance);
                                break;

                            case 4:
                                System.out.println("Tekrar gorusmek uzere!");
                                break;
                        }


                } else {
                    System.out.print("Hatali Kullanici Adi ya da Parola girdiniz, lutfen tekrar deneyiniz! Kalan hakkiniz : " + right-- + "\n");
                }
                if (right == 0) {
                    System.out.println("Hesabiniz kilitlenmistir, lutfen musteri hizmetlerini arayiniz!");
                }

        }
    }
}
