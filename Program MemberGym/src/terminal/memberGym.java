package terminal;

class memberGym {
    private String namaMember; 
    private int umur;
    private int kategori;
    private boolean pakaiTrainer;
    private double biayaDasar;
    
    memberGym(String namaMember, int umur, int kategori, boolean pakaiTrainer) {
        this.namaMember = namaMember;
        setUmur(umur);
        setKategori(kategori);
        this.pakaiTrainer = pakaiTrainer;
    }
    
    public String getNamaMember() {
        return this.namaMember;
    }
    
    public void setUmur(int umur) {
        if (umur >= 15) {
            this.umur = umur;
        } else {
            System.out.println("!! Peringatan: Di bawah umur!! (Umur " + this.namaMember + " auto diset ke 15)");
            this.umur = 15;
        }
    }
    
    public double getBiayaDasar() {
        return this.biayaDasar;
    }
    
    public void setKategori(int kategori) {
        switch (kategori) {
            case 1:
                this.biayaDasar = 50000;
                this.kategori = 1;
                break;
            case 2:
                this.biayaDasar = 400000;
                this.kategori = 2;
                break;
            case 3:
                this.biayaDasar = 4000000;
                this.kategori = 3;
                break;
            default:
                this.biayaDasar = 50000;
                this.kategori = 1;
                System.out.println("!! Peringatan: Kategori " + this.namaMember + " Keluar Batas!! (Auto diset ke Harian)\n");
        }
    }
    
    public double total() {
        double totalBiaya = this.biayaDasar;
        
        if (this.pakaiTrainer) {
            totalBiaya += 150000;
        }
        
        if (this.umur <= 25) {
            totalBiaya *= 0.9;
        }
        
        return totalBiaya;
    }
    
    @Override
    public String toString() {
        
        String namaPaket = "";
        if (this.kategori == 1) namaPaket = "Harian";
        else if (this.kategori == 2) namaPaket = "Bulanan";
        else if (this.kategori == 3) namaPaket = "Tahunan";

        double biayaTrainer = (this.pakaiTrainer) ? 150000 : 0;
        
        double nominalDiskon = 0;
        if (this.umur <= 25) {
            nominalDiskon = (this.biayaDasar + biayaTrainer) * 0.1; 
        }
        
        return "== Bukti Member Gym ==\n"
               + "Nama\t: " + this.namaMember + "\n"
               + "Umur\t: " + this.umur + " tahun\n" 
               + "Paket\t: " + namaPaket + "\n"
               + "Trainer\t: " + (this.pakaiTrainer ? "Ya" : "Tidak") + "\n"
               + "--------------------------\n"
               + "Biaya Dasar\t: Rp" + this.biayaDasar + "\n"
               + "Biaya Trainer\t: Rp" + biayaTrainer + "\n"
               + "Diskon (10%)\t: -Rp" + nominalDiskon + "\n"
               + "--------------------------\n"
               + "TOTAL BAYAR   : Rp" + total() + "\n"
               + "==========================\n";
    }
}