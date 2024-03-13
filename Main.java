import java.util.ArrayList;

public class Main {
    public static <T> void tambahData(ArrayList<T> list, T data) {
        list.add(data);
    }

    public static <T> void hapusData(ArrayList<T> list, T data) {
        list.remove(data);
    }

    public static <T> void editData(ArrayList<T> list, int index, T newData) {
        list.set(index, newData);
    }

    public static void main(String[] args) {
        ArrayList<ATK> daftarATK = new ArrayList<>();
        tambahData(daftarATK, new ATK("A001", "Pulpen", "Snowman Board Marker", 50));
        tambahData(daftarATK, new ATK("A002", "Pensil", "Faber-Castell 2B", 30));
        tambahData(daftarATK, new ATK("A003", "Spidol", "Sharpie Fine Point", 40));
        tambahData(daftarATK, new ATK("A004", "Pulpen", "Pilot G2", 60));
        tambahData(daftarATK, new ATK("A005", "Pensil", "Staedtler Noris", 20));

        ArrayList<Bag> daftarBag = new ArrayList<>();
        tambahData(daftarBag, new Bag("C001", "Tempat Pensil", "Tas Pensil Oxford", 10));
        tambahData(daftarBag, new Bag("C002", "Tas", "Tas Laptop Targus", 15));
        tambahData(daftarBag, new Bag("C003", "Tempat Pensil", "Kotak Pensil Kawaii", 20));
        tambahData(daftarBag, new Bag("C004", "Tempat Pensil", "Case Pensil Polos", 25));
        tambahData(daftarBag, new Bag("C005", "Tas", "Tas Ransel Anello", 12));

        System.out.println("Data ATK sebelum dihapus:");
        for (ATK atk : daftarATK) {
            System.out.println(atk);
        }
        hapusData(daftarATK, daftarATK.get(0));

        System.out.println("\nData ATK setelah dihapus:");
        for (ATK atk : daftarATK) {
            System.out.println(atk);
        }

        System.out.println("\nData Bag sebelum dihapus:");
        for (Bag bag : daftarBag) {
            System.out.println(bag);
        }
        hapusData(daftarBag, daftarBag.get(0)); 

        System.out.println("\nData Bag setelah dihapus:");
        for (Bag bag : daftarBag) {
            System.out.println(bag);
        }
    }
}
