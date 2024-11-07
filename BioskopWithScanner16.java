import java.util.Scanner;
public class BioskopWithScanner16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;
        String [][] penonton = new String[4][2];
 


        while (true) {
            System.out.print("Apa yang ingin anda lakukan (1. input data penonton 2. menampilkan data penonton 3.Exit): ");
        menu = sc.nextInt();
        sc.nextLine();
            switch (menu) {
                case 1:
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                if (baris > penonton.length) {
                    System.out.println("Kursi pada baris tersebut tidak tersedia mohon input ulang");
                    break;
                }
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                if (kolom > penonton[1].length) {
                    System.out.println("Kursi pada kolom tersebut tidak tersedia mohon input ulang");
                    break;
                }
                sc.nextLine();
                
                if (penonton[baris-1][kolom-1]!=null) {
                    System.out.println("Kursi telah terisi mohon input ulang");
                    break;
                }
                penonton[baris-1][kolom-1] = nama;
                    break;
                case 2 :
                for (int i = 0; i<penonton.length; i++) {
                    for (int j = 0; j<penonton[i].length; j++) {
                        if (penonton[i][j]!=null) {
                            System.out.println("Penonton pada baris ke-" + (i+1) + "kolom ke-" + (j+1) + " : " + penonton[i][j]);
                        } else {
                            System.out.println("Penonton pada baris ke-" + (i+1) + " " + "kolom ke-" + (j+1) + " : ***");
                        }
                    }
                }
                default:
                    break;
            } if (menu == 3) {
                break;
            }
        }
    }
}

