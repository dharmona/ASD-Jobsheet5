package Praktikum06;

public class Mahasiswa18 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa18() {}

    Mahasiswa18(String Nim, String Nama, String Kelas, double IPK ) {
        nim = Nim;
        nama = Nama;
        kelas = Kelas;
        ipk = IPK;
    }

    void tampilInformasi() {
        System.out.println("nim : " + nim);
        System.out.println("nama : " + nama);
        System.out.println("kelas : " + kelas);
        System.out.println("ipk : " + ipk);
    }
}
