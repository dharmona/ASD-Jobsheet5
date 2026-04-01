1. Jelaskan fungsi code berikut :
```java
if (data[j - 1] > data[j]) {
    temp = data[j];
    data[j] = data[j - 1];
    data[j - 1] = temp;
}
```
2. Tunjukan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
3. Pada insection sort, jelaskan maksud dari kondisi pada perulangan 
```java
while (j>=0 && data[j]>temp)
```
4. Pada insection sort, apa tujuan dari perintah `data[j + 1] = data[j]`?

Jawab:
1. Membandingkan dua elemen yang bersebelahan (data[j-1] dan data[j])
Jika elemen kiri lebih besar, maka:
Kedua elemen ditukar (swap)

Tujuan:
Menggeser nilai yang lebih besar ke kanan
2. Bagian yang mencari nilai minimum adalah:
```java
int min = i;

for (int j = i + 1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}
```
3. Kondisi ini berarti:
j >= 0 -> memastikan index tidak keluar dari array
data[j] > temp -> cek apakah elemen lebih besar dari nilai yang akan disisipkan

Artinya:
Selama elemen di kiri lebih besar dari temp, maka elemen tersebut harus digeser ke kanan
4. Tujuan data[j + 1] = data[j] adalah Menggeser elemen ke kanan