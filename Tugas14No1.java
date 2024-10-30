import java.util.Scanner;

public class Tugas14No1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlInput, inputMhs, totalNilai = 0, tertinggi = 0, terendah = 100, tampilNilai;
        System.out.print("Banyaknya mahasiswa yang akan di input : ");
        jmlInput = sc.nextInt();
        int[] jmlMhs = new int[jmlInput];
        for (int i = 0; i < jmlMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : " );
            inputMhs = sc.nextInt();
            jmlMhs[i] = inputMhs;
            totalNilai += inputMhs;
            if (inputMhs > tertinggi) {
                tertinggi = inputMhs;
            }
            if (inputMhs < terendah) {
                terendah = inputMhs;
            }
        }
        System.out.println("Nilai semua mahasiswa:");
        for (int i = 0; i < jmlMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + jmlMhs[i]);
        }
        int rata2 = totalNilai/jmlInput;
        System.out.println("Rata-rata nilai mahasiswa : " + rata2);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
    }
}