package terminal;

class Elektronik extends Barang{
    private boolean asuransiPengiriman;

    Elektronik(String namabarang, double hargaDasar, int beratGram, boolean asuransiPengiriman){
        super(namabarang, hargaDasar, beratGram);
        this.asuransiPengiriman = asuransiPengiriman;
    }

    @Override
    public hargaAkhir(){
        double asuransi = this.asuransiPengiriman ? (this.hargaDasar (this.hargaDasar * 0.05)) : 0;
        return super.hargaDasar();
    }
}
