
package oyun_platformu;



public class oyun_platformu {

   

   public static void main(String[] args) {
    // Kullanıcılar oluşturuluyor
    Kullanici cagatay = new Kullanici("Çağatay", "Ulusoy", "cagatay123", "cagatay@gmail.com");
    Kullanici aras = new Kullanici("Aras", "Korkmaz", "aras456", "aras@gmail.com");
    Kullanici sena = new Kullanici("Sena", "Başar", "sena789", "sena@gmail.com");

    // Kullanıcılar
    System.out.println("--------------------------------------------");
    System.out.println("Kullanıcılar:\n");
    System.out.println(cagatay.kullaniciBilgisi());
    System.out.println(aras.kullaniciBilgisi());
    System.out.println(sena.kullaniciBilgisi());

    System.out.println("\n--------------------------------------------");
    // Arkadaşlık nesneleri oluşturuluyor ve istekler gönderiliyor, kabul ediliyor, reddediliyor
    Arkadaslik arkadaslik1 = new Arkadaslik(cagatay, aras);
    arkadaslik1.arkadaslikIstegiGonder();
    arkadaslik1.arkadaslikIstegiReddet();

    Arkadaslik arkadaslik2 = new Arkadaslik(sena, aras);
    arkadaslik2.arkadaslikIstegiGonder();
    arkadaslik2.arkadaslikIstegiReddet();

    Arkadaslik arkadaslik3 = new Arkadaslik(sena, cagatay);
    arkadaslik3.arkadaslikIstegiGonder();
    arkadaslik3.arkadaslikIstegiReddet();

    // Arkadaş listeleri görüntüleniyor
    System.out.println("\n--------------------------------------------");
    System.out.println("Arkadaşlar:\n");

    System.out.println("Çağatay'ın arkadaşları:");
    cagatay.arkadaşlarıGoster();

    System.out.println("\nAras'ın arkadaşları:");
    aras.arkadaşlarıGoster();

    System.out.println("\nSena'nın arkadaşları:");
    sena.arkadaşlarıGoster();

    // Oyunlar seçiliyor
   Oyun oyun1 = new Oyun("Monopoly", "Platform", "Klasik oyun", 50);
    Oyun oyun2 = new Oyun("Kafa Topu", "Spor", "Futbol oyunu", 150);
    Oyun oyun3 = new Oyun("Valorant", "Aksiyon", "Savaş oyunu", 500);

    //  Oyun satın alma
    cagatay.oyunSatınAl(oyun1);
    cagatay.oyunSatınAl(oyun2);

    aras.oyunSatınAl(oyun2);
    aras.oyunSatınAl(oyun3);

    sena.oyunSatınAl(oyun3);
    sena.oyunSatınAl(oyun1);

    //Kullanıcılar oyunlar ve puanlar ekrana yazdırılıyor
    System.out.println("\n--------------------------------------------");
    System.out.println("Oyunlar:");
    System.out.println(oyun1.oyunDetay());
    System.out.println(oyun2.oyunDetay());
    System.out.println(oyun3.oyunDetay());

    //Puanlama 
    double cagatayOyun1Puan = 8;
    double cagatayOyun2Puan = 5;

    double arasOyun2Puan = 7;
    double arasOyun3Puan = 2;

    double senaOyun3Puan = 9;
    double senaOyun1Puan = 8;

    // İlk olarak oyun1 ve oyun2 adlı iki oyun nesnesine Çağatay ve Aras adlı oyuncuların puanları atanıyor.
    oyun1.oyunuPuanla(cagatay, (int) cagatayOyun1Puan);
    oyun2.oyunuPuanla(cagatay, (int) cagatayOyun2Puan);
    oyun2.oyunuPuanla(aras, (int) arasOyun2Puan);
    oyun3.oyunuPuanla(aras, (int) arasOyun3Puan);
    oyun3.oyunuPuanla(sena, (int) senaOyun3Puan);
    oyun1.oyunuPuanla(sena, (int) senaOyun1Puan);

    // üç oyunun ortalamasını hesaplayan üç değişken tanımlanıyor.
    double oyunort1 = (cagatayOyun1Puan + senaOyun1Puan) / 2;
    double oyunort2 = (senaOyun3Puan + cagatayOyun2Puan) / 2;
    double oyunort3 = (arasOyun2Puan + arasOyun3Puan) / 2;

    //ScoreBoard adlı bir sınıfın bir nesnesi oluşturuluyor.
    PuanTablosu puanTablosu = new PuanTablosu();

    //üç oyunun oyuncularının puanlarını yazdırıyoruz.
    System.out.println("\n--------------------------------------------");
    System.out.println("Oyunları Oynayanlar, Satın Alanlar ve Puanlar:");
    oyun1.oyunVeOyuncuPuanlariniYazdir();
    oyun2.oyunVeOyuncuPuanlariniYazdir();
    oyun3.oyunVeOyuncuPuanlariniYazdir();

    // Puan tablosu oluşturuluyor
    puanTablosu.oyunPuanla(oyun1, sena, (int) oyunort1);
    puanTablosu.oyunPuanla(oyun2, sena, (int) oyunort2);
    puanTablosu.oyunPuanla(oyun3, sena, (int) oyunort3);

    // En iyi oyunlar listeleniyor
    System.out.println("\n\n--------------------------------------------");
    System.out.println("En iyi oyunlar:");
    System.out.println(puanTablosu.enIyiOyunlar());
       }

    }
  

