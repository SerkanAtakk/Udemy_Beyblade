import java.util.Scanner;
//Serkan Atak
public class Main {
    public static void main(String[] args) {
        System.out.println("Beyblade Programına Hoşgeldiniz...");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz ?\n(ÇIKIŞ q)");
            String islem = scanner.nextLine();
            if (islem.equalsIgnoreCase("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if (beyblade == null) {
                    System.out.println("Lütfen geçerli bir beyblade ismi girin... ");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}