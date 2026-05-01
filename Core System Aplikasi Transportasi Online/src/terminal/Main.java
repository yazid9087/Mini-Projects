package terminal;

public class Main {
    public static void main(String[] args) {
        // 1. Budi bikin akun dengan saldo awal Rp 50.000, kapasitas riwayat 
        AkunUser akunBudi = new AkunUser("Budi", 50000, 10);

        // 2. Budi pesan Motor, jarak 5km, tarif 2000/km. Cuaca cerah (false).
        // Tarif harusnya: 10.000. Saldo cukup (Sisa 40.000).
        akunBudi.pesanLayanan(new LayananMotor("01", 5, 2000, false));

        // 3. Budi pesan Mobil, jarak 10km, tarif 4000/km. Masuk tol 15.000.
        // Tarif harusnya: (10*4000) + 15000 = 55.000.
        // Saldo Budi cuma 40.000. INI HARUS GAGAL!
        akunBudi.pesanLayanan(new LayananMobil("02", 10, 4000, 15000));

        // 4. Budi Top Up saldo 100.000
        akunBudi.topUp(100000); // Saldo jadi 140.000

        // 5. Budi pesan Mobil yang sama lagi
        // Kali ini HARUS BERHASIL. Sisa saldo: 140.000 - 55.000 = 85.000
        akunBudi.pesanLayanan(new LayananMobil("03", 10, 4000, 15000));

        // 6. Cetak mutasi riwayat
        akunBudi.cetakMutasi();
    }
}