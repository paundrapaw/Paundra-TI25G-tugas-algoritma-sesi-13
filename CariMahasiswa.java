public class CariMahasiswa {
    public static void main(String[] args) {
        String[] nim = {"2025004026", "20250040029", "20250040042"};
        String[] nama = {"Dimas", "Prayogi", "Paundra"};

        String cariNama = "Prayogi";
        int langkah = 0;
        boolean ditemukan = false;

        for (int i = 0; i < nama.length; i++) {
            langkah++;
            if (nama[i].equalsIgnoreCase(cariNama)) {
                System.out.println("Mahasiswa ditemukan");
                System.out.println("NIM   : " + nim[i]);
                System.out.println("Nama  : " + nama[i]);
                System.out.println("Index : " + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa tidak ditemukan");
        }

        System.out.println("Jumlah perbandingan: " + langkah);
    }
}
