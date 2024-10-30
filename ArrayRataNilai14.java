import java.util.Scanner;

public class ArrayRataNilai14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiMhs = 0;
        int tidkLulus = 0, nilai, lulus = 0;
        double totalLulus = 0, totalTdkLulus = 0;
        double rata2Lulus, rata2TdkLulus;
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();
        int[] w = new int[jmlMhs];
        for (int i = 0; i < w.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs = sc.nextInt();
            if (nilaiMhs < 70) {
                tidkLulus++;
                totalTdkLulus += nilaiMhs;
            }
            if (nilaiMhs > 70) {
                lulus++;
                totalLulus += nilaiMhs;
            }
        }
        rata2Lulus = totalLulus/lulus;
        rata2TdkLulus = totalTdkLulus/tidkLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
    }
}