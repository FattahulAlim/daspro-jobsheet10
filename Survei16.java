import java.util.Scanner;

public class Survei16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totsem=0;
        int[][] hasil = new int[10][6];

        for (int i=0; i<hasil.length; i++) {
            System.out.println("responden ke-" + (i+1));
            for (int j=0; j<hasil[0].length; j++) {
                System.out.print("Pertanyaan ke-" + (j+1) + ": ");
                hasil[i][j] = sc.nextInt();
                if (hasil[i][j] > 5 && hasil[i][j] < 1) {
                    System.out.println("Mohon maaf inputan salah mohon input ulang dengan nilai 1-5");
                    break;
                }
            }
        }
        for (int i=0; i<hasil.length; i++) {
            double ratres = 0;
            for (int j=0; j<hasil[0].length;j++) {
                ratres += hasil[i][j];
                totsem += hasil[i][j];
            } System.out.println("Rata rata responden ke-" + (i+1) + " : " + ratres/6);
        }
        for (int j=0; j<hasil[0].length;j++) {
            double ratsurv = 0;
            for (int i=0; i<hasil.length; i++) {
                ratsurv += hasil[i][j];
            } System.out.println("Rata rata pertanyaan ke-" + (j+1) + " : " + ratsurv/10);
        } System.out.println("Rata rata keseluruhan: " + totsem/60);
    }
}