package terminal;

public class Main {
    public static void main(String[] args) {
        AkunUser akunBudi = new AkunUser("Budi", 50000, 10);

        akunBudi.pesanLayanan(new LayananMotor("01", 5, 2000, false));

        akunBudi.pesanLayanan(new LayananMobil("02", 10, 4000, 15000));

        akunBudi.topUp(100000);

        akunBudi.pesanLayanan(new LayananMobil("03", 10, 4000, 15000));

        akunBudi.cetakMutasi();
    }
}