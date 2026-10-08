public class Main {
    public static void main(String[] args) {
        Kitap k = new Kitap();
        k.baslik = "Sefiller";

        KitapKopyasi kopya = new KitapKopyasi();
        kopya.kitap = k;

        Kullanici kul = new Kullanici();
        kul.ad = "Ahmet";

        OduncKaydi kayit = new OduncKaydi();
        kayit.kullanici = kul;
        kayit.kopya = kopya;

        System.out.println(kul.ad + " " + kopya.kitap.baslik + " kitabini aldi.");
    }
}
