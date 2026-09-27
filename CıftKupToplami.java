public class CiftKupToplami {
    public static void main(String[] args) {
        int toplam = 0;

        // 2'den 20'ye kadar ikişer artarak ilerleyen döngü (çift sayılar)
        for (int i = 2; i <= 20; i += 2) {
            int kup = i * i * i;
            toplam += kup;
            System.out.println(i + " sayısının küpü: " + kup);
        }

        System.out.println("----------------------------------------");
        System.out.println("1'den 20'ye kadar olan çift sayıların küplerinin toplamı: " + toplam);
    }
}
