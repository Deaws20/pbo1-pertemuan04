package Tugas;

public class TugasPerulangan {
    public static void main(String[] args) {
        int saldotabungan = 200;
        int syaratsaldoundian = 300;

        System.out.println("Saldo Tabungan : " + "Rp." + saldotabungan + "jt");
        System.out.println("Syarat Memenangkan Undian : " + "Rp." + syaratsaldoundian + "jt");

        do {
            saldotabungan++;
            System.out.println("Tingkatkan Saldo Tabungan Anda!");
            System.out.println("Saldo Tabungan : " + "Rp." + saldotabungan + "jt");
        } while (saldotabungan != syaratsaldoundian);

        System.out.println("Saldo Tabungan Anda Telah Mencapai " + "Rp." + saldotabungan + "jt");
        System.out.println("Anda Mendapatkan Hadiah Undian Mobil !!!");


    }
}
