1.	Perhatikan perulangan di dalam bubbleSort() di bawah ini:
    a.	Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
    b.	Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
    c.	Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i  akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
2.	Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!
3. Untuk apa code ini?

Jawaban:
1. 
a. Mengapa syarat i < listMhs.length - 1?
Dalam bubble sort, jumlah iterasi maksimal adalah n - 1. Setiap iterasi (i) akan menempatkan 1 data terbesar ke posisi akhir

Jadi:
Jika ada n data → butuh n - 1 tahap, Iterasi terakhir sebenarnya sudah tidak perlu karena data sudah otomatis terurut

b. Mengapa syarat j < listMhs.length - i?
Setiap iterasi i, bagian belakang array sudah terurut, Jadi tidak perlu dibandingkan lagi

Penjelasan:

Iterasi ke-1 → bandingkan semua data
Iterasi ke-2 → elemen terakhir sudah benar → tidak perlu dicek
Iterasi ke-3 → dua elemen terakhir sudah benar, dst

Maka batasnya dikurangi i

c. Jika jumlah data 50
Perulangan i:
i < 50 - 1 → i < 49

Jadi berlangsung 49 kali

Tahap bubble sort:
Juga 49 tahap

Intinya:
Banyak tahap = n - 1
Jadi: 50 - 1 = 49 tahap

2. DONE
3. Menukar posisi data agar elemen dengan nilai tertentu (min/max) berpindah ke posisi yang seharusnya dalam proses pengurutan (sorting).