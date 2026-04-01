package Praktikum06;

public class MahasiswaBerprestasi18 {
    Mahasiswa18 listMhs[];
    int idx = 0;

    MahasiswaBerprestasi18(int jumlah) {
        listMhs = new Mahasiswa18[jumlah];
    }
    
    void tambah(Mahasiswa18 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa18 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("----------------------------");
            }
        }
    }

    void bubblesort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa18 temp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = temp;
                }
            }
        }
    }

    void selectionsort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa18 temp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = temp;
        }
    }
}
