import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        /* Pekerjaan anda mulai dari sini */
         System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        tampilkanAngkaGanjil(n);
    }

    public static void tampilkanAngkaGanjil(int n) {
        System.out.println("Angka ganjil dari 0 hingga " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
