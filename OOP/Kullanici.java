
package oyun_platformu;



    import java.util.ArrayList;
import java.util.List;

class Kullanici {

    // Kullanıcı sınıfı için gerekli değişkenlerin tanımlanması
    private final String ad; // Kullanıcının adı
    private final String soyad; // Kullanıcının soyadı
    private final String kullaniciAdi; // Kullanıcının kullanıcı adı
    private final String mail; // Kullanıcının e-posta adresi
    private final List<Oyun> oyunlar; // Kullanıcının oynadığı oyunların listesi
    private final List<Kullanici> arkadaslar; // Kullanıcının arkadaşları listesi
    private final PuanTablosu puanTablosu; // Kullanıcının puan tablosu

// Kullanıcı sınıfının yapıcı metodu
    public Kullanici(String ad, String soyad, String kullaniciAdi, String mail) {
        this.ad = ad;
        this.soyad = soyad;
        this.kullaniciAdi = kullaniciAdi;
        this.mail = mail;
        this.oyunlar = new ArrayList<>(); // Yeni bir boş oyunlar listesi oluşturulur
        this.arkadaslar = new ArrayList<>(); // Yeni bir boş arkadaşlar listesi oluşturulur
        this.puanTablosu = new PuanTablosu(); // Yeni bir puan tablosu oluşturulur
    }


// Kullanıcı bilgilerini döndüren metot
    public String kullaniciBilgisi() {
        return "Ad: " + ad + "\nSoyad: " + soyad + "\nKullanıcı Adı: " + kullaniciAdi + "\nMail: " + mail + "\n";
    }

// Oyun satın alma
    public void oyunSatınAl(Oyun oyun) {
        oyunlar.add(oyun);
        oyun.oyuncuEkle(this);
    }

// Arkadaş ekleme
    public void arkadaşEkle(Kullanici kullanici) {
        if (!arkadaslar.contains(kullanici)) {
            arkadaslar.add(kullanici);
        } else {
            System.out.println("Bu kullanıcı zaten arkadaş listenizde.\n");
        }
    }

// Oyunları gösterme
    public void oyunlariGoster() {
        for (Oyun oyun : oyunlar) {
            System.out.println(oyun.oyunDetay());
        }
    }

    public String getKullaniciAdi() {
        return kullaniciAdi; // Kullanıcı adını döndürür.
    }

// Arkadaşları gösterme
    public void arkadaşlarıGoster() {
        for (Kullanici kullanici : arkadaslar) { // Arkadaşlar listesi üzerinde döngü oluşturulur.
            System.out.println(kullanici.kullaniciBilgisi()); // Her arkadaşın bilgisi ekrana yazdırılır.
        }
    }

// Arkadaş ekleme
    public void arkadasEkle(Kullanici kullanici) {
        System.out.println("Ad: " + ad); // Kullanıcının adı ekrana yazdırılır.
        if (!arkadaslar.contains(kullanici)) { // Eğer kullanıcı arkadaş listesinde yoksa,
            arkadaslar.add(kullanici); // kullanıcı arkadaş listesine eklenir.
            System.out.println("Arkadaşlık isteği gönderildi."); // Arkadaşlık isteği gönderildiği mesajı ekrana yazdırılır.
        } else { // Eğer kullanıcı arkadaş listesinde varsa,
            System.out.println("Bu kullanıcı zaten arkadaş listenizde."); // Bu kullanıcının zaten arkadaş listesinde olduğu mesajı ekrana yazdırılır.
        }
    }
}


