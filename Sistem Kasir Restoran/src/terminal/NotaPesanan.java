package terminal;

class NotaPesanan {
    private String namaPelanggan;
    private Menu[] daftarPesanan;
    private int totalItem;

    NotaPesanan(String namaPelanggan, int kapasitasMaks){
        this.namaPelanggan = namaPelanggan;
        this.daftarPesanan = new Menu[kapasitasMaks];
        this.totalItem = 0;
    }

    void tambahMenu (Menu pesananBaru){
        if (totalItem < daftarPesanan.length) {
            daftarPesanan[totalItem] = pesananBaru;
            totalItem++;
        }
        else{
            System.out.println("Maaf, keranjang pesanan penuh!");
        }
    }

    void cetakStruk(){
        System.out.println("== Nota Pesanan ==");
        System.out.println("Pelanggan: " + this.namaPelanggan);
        double grandTotal = 0;

        for (int i = 0; i < totalItem; i++) {
            System.out.println(daftarPesanan[i].show());
            System.out.println("Harga: " + daftarPesanan[i].hitungHarga());

            grandTotal += daftarPesanan[i].hitungHarga();
        }

        System.out.println("------------------------");
        System.out.println("Grand Total: " + grandTotal);
    }
}
