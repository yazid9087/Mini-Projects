package terminal;

public class KeranjangBelanja {
    Barang[] daftarBelanja;
    int totalItem;

    KeranjangBelanja(int kapasitas){
        this.daftarBelanja = new Barang[kapasitas];
        this.totalItem = 0;
    }

    void tambahBarang(Barang b){
        if (this.totalItem < this.daftarBelanja.length) {
            this.daftarBelanja[totalItem] = b;
            totalItem++;
            System.out.println("Berhasil memasukkan barang ke keranjang!!");
        }
        else{
            System.out.println("Keranjang sudah penuh!!");
        }
    }

    public double hitungTotalOngkir(){
        int totalBerat = 0;
        for (int i = 0; i < this.totalItem; i++) {
            totalBerat += this.daftarBelanja[i].beratGram;
        }
        double hargaOngkir = totalBerat * 10;
        return hargaOngkir;
    }

    void cetakInvoice(){
        double subTotalHarga = 0;
        System.out.println("== INVOICE BELANJA ==");
        for (int i = 0; i < this.totalItem; i++) {
            System.out.println(this.daftarBelanja[i].toString());
            subTotalHarga += this.daftarBelanja[i].hargaAkhir();
        }

        double ongkir = this.hitungTotalOngkir();

        double grandTotal = subTotalHarga + ongkir;

System.out.println("-----------------------");
// %.0f artinya: format sebagai float/double, dengan 0 angka di belakang koma
System.out.printf("Subtotal Barang : Rp %.0f\n", subTotalHarga); 
System.out.printf("Total Ongkir    : Rp %.0f\n", ongkir);
System.out.printf("GRAND TOTAL     : Rp %.0f\n", grandTotal);
    }
}
