package terminal;

class Minuman extends Menu{
    private boolean ukuranJumbo;

    Minuman(String namaMenu, double hargaDasar, boolean ukuranJumbo){
        super(namaMenu, hargaDasar);
        this.ukuranJumbo = ukuranJumbo;
    }

    @Override
    public double hitungHarga(){
        double hargaMinum = this.ukuranJumbo ? 3000 : 0;

        return super.hitungHarga() + hargaMinum;
    }


    @Override
    public String toString(){
        String Minum = this.ukuranJumbo ? " (Jumbo)" : " (Biasa)";

        return super.show() + Minum;
    }
}
