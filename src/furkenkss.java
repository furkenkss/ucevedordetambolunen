import java.util.Scanner;

public class furkenkss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaca kadar sayilara bakilsin: ");
        int sayi = input.nextInt();
        int toplam = 0;
        int sayiMiktari = 0;
        double ortalama;
        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                if (i == 0) {
                    continue;
                }
                toplam += i;
                sayiMiktari++;

            }

        }
        ortalama = (double)toplam / sayiMiktari;
        System.out.println("3 ve 4 'un kati olan sayilarin ortalamasi: " + ortalama);
        }

    }

