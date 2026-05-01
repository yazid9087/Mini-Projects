package terminal;

class AkunUser {
    String namaUser;
    double saldoGopay;
    Layanan[] riwayatPerjalanan;
    int totalPerjalanan;

    AkunUser(String namaUser, double saldoAwal, int kapasitasRiwayat){
        this.namaUser = namaUser;
        this.saldoGopay = saldoAwal;
        this.riwayatPerjalanan = new Layanan[kapasitasRiwayat];
        this.totalPerjalanan = 0;
    }

    public double topUp(double nominal){
        if (nominal >= 10000) {
            this.saldoGopay += nominal;
            System.out.println("Top Up Rp " + nominal + " Berhasil!");
        } else {
            System.out.println("Maaf, top up terlalu sedikit! Minimal Rp 10.000");
        }
        return this.saldoGopay;
    }

    public void pesanLayanan(Layanan pesananBaru){
        double hargaTarif = pesananBaru.hitungTarif();
        
        if (this.saldoGopay >= hargaTarif) {
            this.saldoGopay -= hargaTarif;
            
            if (this.totalPerjalanan < this.riwayatPerjalanan.length) {
                this.riwayatPerjalanan[this.totalPerjalanan] = pesananBaru;
                this.totalPerjalanan++;
                System.out.println("Order Berhasil! Saldo terpotong Rp " + hargaTarif);
            } else {
                System.out.println("Order Gagal! Memori riwayat penuh.");
            }
        } else {
            System.out.println("Order Gagal! Saldo kurang untuk membayar Rp " + hargaTarif);
        }
    }

    public void cetakMutasi(){
        System.out.println("===========================");
        System.out.println("Akun : " + this.namaUser);
        System.out.println("Sisa Saldo : Rp " + this.saldoGopay);
        System.out.println("--- Riwayat Perjalanan ---");
        
        for (int i = 0; i < this.totalPerjalanan; i++) {
            System.out.println((i+1) + ". " + this.riwayatPerjalanan[i].toString());
        }
        System.out.println("===========================");
    }
}