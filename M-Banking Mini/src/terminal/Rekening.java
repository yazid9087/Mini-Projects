package terminal;

class Rekening {
    String namaNasabah;
    double saldo;
    Transaksi[] riwayat;
    int jumlahTransaksi;

    Rekening(String namaNasabah, double saldo){
        this.namaNasabah = namaNasabah;
        this.saldo = saldo;

    }

    class Transaksi{
        String jenis;
        double nominal;

        Transaksi(String jenis, double nominal){
            this.jenis =jenis;
            this.nominal = nominal;
        }

        void setor(double uang){
            if (this.jumlahTransaksi < this.riwayat.length) {
                saldo += uang;

                Transaksi t = this.new Transaksi("Setor", uang) ;
            }


        }
    }
}
