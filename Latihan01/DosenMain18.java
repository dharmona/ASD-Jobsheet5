package Latihan01;

public class DosenMain18 {
    public static void main(String[] args) {
        Dosen18 d1 = new Dosen18("1", "Dhita", true, 19);
        Dosen18 d2 = new Dosen18("3", "Pandhu", false, 12);
        Dosen18 d3 = new Dosen18("2", "Arya", false, 20);

        DosenData18 listDosen = new DosenData18();
        listDosen.tambah(d1);
        listDosen.tambah(d2);
        listDosen.tambah(d3);

        System.out.println("Data Sebelum Sorting");
        listDosen.tampil();
        System.out.println();

        System.out.println("Data Setelah Bubble Sort Asc");
        listDosen.bubbleSortASC();
        listDosen.tampil();
        System.out.println();

        System.out.println("Data Setelah Insertion Sort DESC");
        listDosen.insertionSortDESC();
        listDosen.tampil();
    }
}
