import java.util.Scanner;

public class Tugas14No3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String yatdk, key;
        do {
            System.out.print("Apakah anda ingin melakukan pencarian? (ya/tidak): ");
            yatdk = sc.nextLine();
            if (yatdk.equalsIgnoreCase("ya")) {
                System.out.print("Masukkan menu yang mau dicari: ");
                key = sc.nextLine();
                boolean nyari = false; 
                for (int i = 0; i < menu.length; i++) {
                    if (key.equalsIgnoreCase(menu[i])) {
                        System.out.println("Ditemukan " + key + " pada index ke-" + i);
                        nyari = true;
                        break;
                    }
                }
                if (!nyari) {
                    System.out.println("Menu " + key + " tidak ditemukan.");
                }
            }
        } while (yatdk.equalsIgnoreCase("ya"));
    }
}
