import java.util.Scanner;

public class Tugas14No2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaKopi = 4000, hargaNugget = 6000, hargaNasgor = 10000, jmlPesanan;
        System.out.print("Berapa kali anda ingin melakukan pemesanan: ");
        jmlPesanan = sc.nextInt();
        sc.nextLine();
        String[] namaPesanan = new String[jmlPesanan];
        int[] jumlahPesanan = new int[jmlPesanan];
        int totalBiaya = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("\nList Menu dan Harga:");
            System.out.println("1. Kopi : Rp" + hargaKopi);
            System.out.println("2. Nugget : Rp" + hargaNugget);
            System.out.println("3. Nasgor : Rp" + hargaNasgor);
            System.out.print("Apa yang ingin anda beli: ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Berapa yang anda pesan: ");
            jumlahPesanan[i] = sc.nextInt();
            sc.nextLine();
            if (namaPesanan[i].equalsIgnoreCase("kopi")) {
                totalBiaya += jumlahPesanan[i] * hargaKopi;
            } else if (namaPesanan[i].equalsIgnoreCase("nugget")) {
                totalBiaya += jumlahPesanan[i] * hargaNugget;
            } else if (namaPesanan[i].equalsIgnoreCase("nasgor")) {
                totalBiaya += jumlahPesanan[i] * hargaNasgor;
            } else {
                System.out.println("Menu tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
        System.out.println(" Daftar Pesanan:");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " Jumlah: " + jumlahPesanan[i]);
        }
        System.out.println("Total Biaya: Rp" + totalBiaya);
    }
}
