
package oyun_platformu;


    import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// PuanTablosu sınıfı tanımlanır
class PuanTablosu {

    // puanlarını tutmak için Map yapısı kullanılıyor.
    private final Map<Oyun, Integer> puanlar;

    // PuanTablosu sınıfının yapıcısı tanımlanır
    public PuanTablosu() {
        // Map yapısı oluşturuluyor.
        this.puanlar = new HashMap<>();
    }

    // Oyun puanlama işlemini gerçekleştiren metot tanımlanıyor.
    public void oyunPuanla(Oyun oyun, Kullanici Sena, int puan) {
        // Oyun ve puan Map yapısına ekleniyor.
        puanlar.put(oyun, puan);
    }

    // Puan tablosunu görüntülemek için metot tanımlanıyor.
    public String puanTablosuGoruntule() {
        // Boş bir String nesnesi oluşturuluyor.
        String result = "";
        // Map yapısındaki her bir eleman için döngü oluşturuluyor.
        for (Map.Entry<Oyun, Integer> entry : puanlar.entrySet()) {
            // Oyun detayları ve puan bilgisi String nesnesine ekleniyor.
            result += entry.getKey().oyunDetay() + "Puan: " + entry.getValue() + "\n";
        }
        // Oluşturulan String nesnesi geri döndürülüyor.
        return result;
    }

    // En iyi oyunları görüntülemek için metot tanımlanıyor.
    public String enIyiOyunlar() {
        // Map yapısındaki elemanlar List yapısına aktarılıyor.
        List<Map.Entry<Oyun, Integer>> list = new ArrayList<>(puanlar.entrySet());
      
        list.sort(Map.Entry.comparingByValue());
        // Listeyi ters çevirme işlemi yapılıyor.
        Collections.reverse(list);
        String result = "";
        // En iyi 3 oyunu görüntülemek için döngü oluşturuluyor.
        for (int i = 0; i < 3; i++) {
            // Oyun detayları ve puan bilgisi String nesnesine ekleniyor.
            result += list.get(i).getKey().oyunDetay() + "Puan: " + list.get(i).getValue() + "\n";
        }
        // Oluşturulan String nesnesi geri döndürülüyor.
        return result;
    }

}


