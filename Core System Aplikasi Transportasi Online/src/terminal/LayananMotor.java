package terminal;

class LayananMotor extends Layanan {
    private boolean isHujan;

    LayananMotor(String idOrder, double jarakKm, double tarifPerKm, boolean isHujan) {
        super(idOrder, jarakKm, tarifPerKm);
        this.isHujan = isHujan;
    }

    @Override
    public double hitungTarif() {
        if (isHujan == true) {
            this.tarifPerKm += 10000;
        }

        return super.hitungTarif();
    }

    @Override
    public String toString() {
        String statusCuaca = this.isHujan ? "Hujan" : "Cerah";
        return "[Motor] Order [Id:" + idOrder + "] (" + statusCuaca + ")";
    }
}
