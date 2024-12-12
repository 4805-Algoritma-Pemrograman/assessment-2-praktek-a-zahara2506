import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    static ArrayList<Integer> keranjang = new ArrayList<>();
    static int[] hargaMenu = {35000, 45000, 20000, 15000};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.print("Masukan nama menu [Burger/Steak/Spaghetti/Kentang]: ");
            pilihan = scanner.nextLine().toLowerCase();

            switch (pilihan) {
                case "burger":
                    keranjang.add(hargaMenu[0]);
                    break;
                case "steak":
                    keranjang.add(hargaMenu[1]);
                    break;
                case "spaghetti":
                    keranjang.add(hargaMenu[2]);
                    break;
                case "kentang":
                    keranjang.add(hargaMenu[3]);
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }

            System.out.print("Input lagi (Y/N)?: ");
            pilihan = scanner.nextLine().toUpperCase();
        } while (!pilihan.equals("N"));

        int totalBelanja = hitungTotalBelanja();
        int diskon = hitungDiskon(totalBelanja);
        int totalBayar = totalBelanja - diskon;

        System.out.println("Total item pesanan = " + keranjang.size());
        System.out.println("Total yang harus dibayar = " + totalBayar);
    }

    static int hitungTotalBelanja() {
        int total = 0;
        for (int harga : keranjang) {
            total += harga;
        }
        return total;
    }

    static int hitungDiskon(int totalBelanja) {
        if (totalBelanja < 50000) {
            return 0;
        } else if (totalBelanja >= 50000 && totalBelanja < 100000) {
            return (int) (totalBelanja * 0.05);
        } else {
            return (int) (totalBelanja * 0.1);
            
 }
        
}   
}

