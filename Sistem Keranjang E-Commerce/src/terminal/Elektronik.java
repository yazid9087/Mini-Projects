package terminal;

class Elektronik extends Barang {
    private boolean asuransiPengiriman;

    Elektronik(String namabarang, double hargaDasar, int beratGram, boolean asuransiPengiriman) {
        super(namabarang, hargaDasar, beratGram);
        this.asuransiPengiriman = asuransiPengiriman;
    }

    @Override
    public double hargaAkhir(){
        double hargaAsli = super.hargaAkhir();
        double hargaTotal = this.asuransiPengiriman ? (hargaAsli + (hargaAsli * 0.05)) : hargaAsli;
        return hargaTotal;
    }

    @Override
    public String toString(){
        String teksAsuransi = this.asuransiPengiriman ? "[Dilindungi Asuransi]" : "";
        return super.toString() + teksAsuransi;
    }
}
