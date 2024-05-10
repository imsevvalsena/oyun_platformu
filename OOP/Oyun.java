
package oyun_platformu;


    import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Oyun {

    private final String ad; // Oyunun adını saklamak için kullanılan değişken.
    private final String tur; // Oyunun türünü saklamak için kullanılan değişken.
    private final String aciklama; // Oyunun açıklamasını saklamak için kullanılan değişken.
    private final int fiyat; // Oyunun fiyatını saklamak için kullanılan değişken.
    private int degerlendirme; // Oyunun genel olarak ne kadar beğenildiğini saklamak için kullanılan değişken.
    private final List<Kullanici> oyuncular; // Oyunda yer alan kullanıcıların listesini saklamak için kullanılan değişken.

    // Kullanıcıların oyunlara verdikleri puanları saklamak için eklendi
    private final Map<Kullanici, Integer> oyuncuPuanlar; //Her bir kullanıcının puanı kullanıcının kendisiyle eşleştirilerek saklanır.

    void oyuncuEkle(Kullanici kullanici) {
        oyuncular.add(kullanici); // oyuncular ArrayList'ine kullanıcı ekleme
        oyuncuPuanlar.put(kullanici, 0); // oyuncuPuanlar HashMap'ine yeni kullanıcı ve başlangıçta 0 puan ekleme
    }

     Oyun(String ad, String tur, String aciklama, int fiyat) {
        this.ad = ad;
        this.tur = tur; // Oyun türünü belirleme
        this.aciklama = aciklama; // Oyun açıklamasını belirleme
        this.fiyat = fiyat;
        this.degerlendirme = 0; // Oyun değerlendirmesini başlangıçta 0 olarak belirleme
        this.oyuncular = new ArrayList<>(); // oyuncular ArrayList'ini oluşturma

        // Kullanıcıların oyunlara verdikleri puanları saklamak için oyuncuPuanlar HashMap'ini oluşturma
        oyuncuPuanlar = new HashMap<>();
    }

    //oyunun adını, türünü, açıklamasını ve fiyatını bir string olarak döndürür.
    public String oyunDetay() {
        return "\nOyun Adı: " + ad + "\nTürü: " + tur + "\nAçıklama: " + aciklama + "\nFiyatı: " + fiyat + "\n";
    }

    //oyunun değerlendirmesini puan olarak kaydeder.
    public void oyunDegerlendir(int puan) {
        degerlendirme = puan;
    }
    public void oyunuPuanla(Kullanici kullanici, int puan) {
        if (oyuncular.contains(kullanici)) {
            oyuncuPuanlar.put(kullanici, puan);
        }
    }

    //oyunu satın alan ve puanlayan kullanıcıları listeler.
    public void oyunculariListele() {
        System.out.println(ad + " oyununu satın alan ve puanlayan kullanıcılar:");
        for (Kullanici kullanici : oyuncular) {
            System.out.println(kullanici.getKullaniciAdi()
                    + ", Puan: "
                    + oyuncuPuanlar.get(kullanici));
        }
    }

    //oyunun adını ve oyuncuların verdiği puanları yazdırır.
    public void oyunVeOyuncuPuanlariniYazdir() {
        System.out.println("\nOyun Adı: " + ad);
        for (Kullanici kullanici : oyuncular) {
            System.out.println(kullanici.getKullaniciAdi() + " Puan: " + oyuncuPuanlar.get(kullanici));
        }
    }

}


