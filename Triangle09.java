import java.util.Scanner;

public class Triangle09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // 1. Segitiga Siku-siku Normal
        int i = 1; //perubahan dari 0 menjadi 1 
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // perintah yg ditambahkan 
            i++;
        }
        System.out.println(); // Memberi jarak spasi antar segitiga
        // 2. Segitiga Terbalik
        i = n; // Cukup tulis i = n; tanpa kata 'int'
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--; // ggunakan decrement karena nilainya dikurangi dari n ke 1
        }

        sc.close();
    }
}