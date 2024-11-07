import java.util.Scanner;
import java.util.Arrays;
public class Siakad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlSiswa, jmlNilai;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah nilai yang akan diinput: ");
        jmlNilai = sc.nextInt();

        int[][] nilai = new int[jmlSiswa][jmlNilai];

        for (int i = 0; i<nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1) + " ");
            double totalPerSiswa = 0;
            for (int j = 0; j<nilai[i].length; j++ ) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
        }

        System.out.println("\n===================================");
        System.out.println("Rata-rata Nilai setiap mata kuliah: ");

        for (int j=0; j<nilai[0].length; j++) {
            double totalPerMatkul = 0;
            for (int i =0; i<nilai.length; i++) {
                totalPerMatkul += nilai [i][j];
            }
            System.out.println("Nilai mata kuliah " + (j+1) + ": " + totalPerMatkul / jmlSiswa);
        }
    }
}
