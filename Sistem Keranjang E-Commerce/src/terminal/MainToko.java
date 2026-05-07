package terminal;

public class MainToko {
    public static void main(String[] args) {
        // 1. Buat keranjang kapasitas 5
        KeranjangBelanja keranjang = new KeranjangBelanja(5);

        // 2. Beli Laptop: Harga 10.000.000, Berat 2000g, Pakai Asuransi (+5%)
        keranjang.tambahBarang(new Elektronik("Laptop Asus", 10000000, 2000, true));

        // 3. Beli Kemeja: Harga 200.000, Berat 300g, Sedang Diskon (-20%)
        keranjang.tambahBarang(new Pakaian("Kemeja Flanel", 200000, 300, true));

        // 4. Beli Celana: Harga 150.000, Berat 500g, Tidak Diskon
        keranjang.tambahBarang(new Pakaian("Celana Jeans", 150000, 500, false));

        // 5. Cetak struk!
        keranjang.cetakInvoice();
    }
}