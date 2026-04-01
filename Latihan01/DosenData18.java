package Latihan01;

public class DosenData18 {
    Dosen18 listDosen[] = new Dosen18[3];
    int idx = 0;

    void tambah(Dosen18 dosen) {
        if(idx < listDosen.length){
            listDosen[idx] = dosen;
            idx++;
        } else {
            System.out.println("DATA SUDAH PENUH");
        }
    }

    void tampil() {
        for (Dosen18 dsn : listDosen) {
            if (dsn != null) {
                dsn.tampil();
                System.out.println("------------------------------");
            }
        }
    }

    void bubbleSortASC() {
        for (int i = 0; i < listDosen.length - 1; i++) {
            for (int j = 1; j < listDosen.length - i; j++) {
                boolean condition = listDosen[j].usia < listDosen[j - 1].usia;

                if (condition) {
                    Dosen18 temp = listDosen[j];
                    listDosen[j] = listDosen[j - 1];
                    listDosen[j - 1] = temp;
                }
            }
        }
    }

    void insertionSortDESC() {
        for (int i = 1; i < listDosen.length; i++) {
            Dosen18 temp = listDosen[i];
            boolean condition = listDosen[i-1].usia < temp.usia; 

            while (i>0 && condition) {
                listDosen[i] = listDosen[i-1];
                i--;
            }
            listDosen[i] = temp;
        }
    }
}
