# Post Test 2_PBO
Nadila Putri 2409116052
## Deskripsi Program
Program ini merupakan aplikasi sederhana berbasis console untuk manajemen resep masakan.
Fitur yang tersedia antara lain:
- Menambahkan resep baru
- Melihat daftar resep
- Mengubah resep
- Menghapus resep
- Keluar dari program
Program ini dibuat untuk memenuhi Post Test 2 PBO dengan menerapkan konsep Object Oriented Programming (OOP) seperti constructor, access modifier, serta penggunaan packages.
## Struktur Packages
- packages main > Resepmakanan.java = Berisi entry point (method main) dan menu interaksi dengan pengguna.
- packages service > resepservice.java = Berisi logika utama operasi CRUD (Create, Read, Update, Delete).
- packages model > resep.java = Berisi struktur data / blueprint objek resep (properties, constructor, getter & setter).
## Alur Program
- Saat dijalankan, program akan menampilkan menu utama:
1. Tambah Resep
2. Lihat Resep
3. Ubah Resep
4. Hapus Resep
5. Cari Resep
6. Keluar
- User memilih menu dengan mengetik angka.
  <img width="1300" height="295" alt="image" src="https://github.com/user-attachments/assets/d6e02158-e471-4215-9854-5ff371ddb74e" />
- Jika memilih Tambah Resep, user diminta menginputkan data resep baru.
  <img width="1270" height="506" alt="image" src="https://github.com/user-attachments/assets/d8c4c770-d631-41a5-908d-42bdd8a81f3b" />
- Jika memilih Lihat Resep, semua data resep yang tersimpan ditampilkan.
  <img width="1287" height="432" alt="image" src="https://github.com/user-attachments/assets/62f2dfdb-a5d3-458b-9539-8ff7ea4aba39" />
- Jika memilih Ubah Resep, user memilih nomor resep lalu memasukkan informasi baru. Saat user salah menginputkan nomor resep yang diubah dengan karakter selain angka maka akan muncul statement 'Input hanya boleh berupa angka!' dan saat menginputkan angka yang tidak valid maka akan kembali ke menu utama.
  <img width="1284" height="923" alt="image" src="https://github.com/user-attachments/assets/85c86862-49fd-42d4-9687-c68ee5b076f7" />
- Jika memilih Hapus Resep, user memilih nomor resep yang ingin dihapus. Saat user salah menginputkan nomor resep yang diubah dengan karakter selain angka maka akan muncul statement 'Input hanya boleh berupa angka!' dan saat menginputkan angka yang tidak valid maka akan kembali ke menu utama.
  <img width="1280" height="811" alt="image" src="https://github.com/user-attachments/assets/dfe38a1d-9f90-440b-9854-93b49313aeb4" />
- Jika memilih Cari Resep, user akan diminta memasukkan kata kunci nama resep. Jika kata kunci cocok dengan sebagian atau seluruh nama resep, maka semua resep yang sesuai akan ditampilkan. Jika kata kunci tidak ditemukan pada daftar resep, maka akan muncul pesan "Resep dengan kata kunci '...' tidak ditemukan."
  <img width="1283" height="1259" alt="image" src="https://github.com/user-attachments/assets/3e99fa04-6f12-4802-8a2f-0a1c8c52ebab" />
- Keluar, program berhenti dan menampilkan statement penutup.
  <img width="1840" height="547" alt="image" src="https://github.com/user-attachments/assets/3ccd2ae9-e144-474f-80e4-7d64cf7890a0" />
