
package oyun_platformu;


class Arkadaslik {

    // "Arkadaslik" sınıfı iki nesne alır.
    private final Kullanici kullanici1;
    private final Kullanici kullanici2;

    // "Arkadaslik" sınıfı başlatıldığında, iki nesne de tanımlanır.
    public Arkadaslik(Kullanici kullanici1, Kullanici kullanici2) {
        this.kullanici1 = kullanici1;
        this.kullanici2 = kullanici2;
    }

    // "arkadaslikIstegiGonder" işlemi
    public void arkadaslikIstegiGonder() {
       
        System.out.println(kullanici1.kullaniciBilgisi().split("\n")[0] + "\nArkadaşlık isteği gönderildi.\n");
    }

    // "arkadaslikIstegiKabulEt" işlemi
    public void arkadaslikIstegiKabulEt() {
        // arkadaşlar listelere eklenir.
        kullanici1.arkadaşEkle(kullanici2);
        kullanici2.arkadaşEkle(kullanici1);
        
        System.out.println(kullanici2.kullaniciBilgisi().split("\n")[0] + "\nArkadaşlık isteği kabul edildi.\n");
    }

    // "arkadaslikIstegiReddet" işlemi
    public void arkadaslikIstegiReddet() {
       
        System.out.println(kullanici1.kullaniciBilgisi().split("\n")[0] + "\nArkadaşlık isteği reddedildi.\n");
    }

    // "arkadaslikIstegiGonderZatenArkadas" işlemi 
    public void arkadaslikIstegiGonderZatenArkadas() {
        
        System.out.println(kullanici1.kullaniciBilgisi().split("\n")[0] + "\nArkadaşlık isteği gönderildi.\nBu kullanıcı zaten arkadaş listenizde.");
    }

}


