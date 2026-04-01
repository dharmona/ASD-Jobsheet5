package Praktikum06;

import java.util.Scanner;

public class MahasiswaMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // buang newline

        MahasiswaBerprestasi18 mhs = new MahasiswaBerprestasi18(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Prodi : ");
            String prodi = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // buang newline

            Mahasiswa18 m = new Mahasiswa18(nim, nama, prodi, ipk);
            mhs.tambah(m);
        }

        System.out.println("\nData sebelum diurutkan");
        mhs.tampil();

        System.out.println("\nData setelah diurutkan (Bubble Sort DESC)");
        mhs.bubblesort();
        mhs.tampil();

        System.out.println("\nData setelah diurutkan (Selection Sort DESC)");
        mhs.selectionsort();
        mhs.tampil();

        System.out.println("\nData setelah diurutkan (Insertion Sort DESC)");
        mhs.insertionsort();
        mhs.tampil();

        sc.close();
    }
}