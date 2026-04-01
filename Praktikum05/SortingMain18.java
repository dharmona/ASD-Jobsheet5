package Praktikum05;

public class SortingMain18 {
    public static void main(String[] args) {
        int a[] = { 11, 21, 22, 43, 23, 90 };
        int b[] = { 1, 2, 12, 32, 53, 6, 73, 12, 4 };
        int c[] = { 1, 3, 12, 14, 3, 45, 6, 7, 72 };

        /* Buble Sort */
        Sorting18 dataUrut1 = new Sorting18(a, a.length);
        System.out.println("Data sebelum diurutkan");
        dataUrut1.tampil();

        System.out.println("Data setelah diurutkan (Buble Sort ASC)");
        dataUrut1.bubbleSort();
        dataUrut1.tampil();
        System.out.println();

        /* Selection Sort */
        Sorting18 dataUrut2 = new Sorting18(b, b.length);
        System.out.println("Data sebelum diurutkan");
        dataUrut2.tampil();

        System.out.println("Data setelah diurutkan (Selection Sort ASC)");
        dataUrut2.selectionSort();
        dataUrut2.tampil();
        System.out.println();

        /* Insertion Sort */
        Sorting18 dataUrut3 = new Sorting18(c, c.length);
        System.out.println("Data sebelum diurutkan");
        dataUrut3.tampil();

        System.out.println("Data setelah diurutkan (Insertion Sort ASC)");
        dataUrut3.insertionSort();
        dataUrut3.tampil();
        System.out.println();
    }
}
