package terminal;

public class Main {
    public static void main(String[] args) {
        NotaPesanan notaBudi = new NotaPesanan("Budi", 3);

        notaBudi.tambahMenu(new Makanan("Sate Ayam", 20000, true));
        notaBudi.tambahMenu(new Minuman("Es Jeruk", 8000, false));
        notaBudi.tambahMenu(new Minuman("Kopi Susu", 15000, true));

        notaBudi.cetakStruk();

        // Kita pakai Polimorfisme: Wadah Induk (Menu), isinya Anak (Makanan)
        Menu tesPesanan = new Makanan("Sate Ayam", 20000, true);

        // Perhatikan: Kita langsung mencetak objeknya, BUKAN memanggil .show()
        System.out.println(tesPesanan);
    }
}
