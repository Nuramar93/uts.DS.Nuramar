import java.util.ArrayList;

public class soal3 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
        mahasiswa.add(new Mahasiswa(231003, "Nuramar", "Teknik Informatika", 23102022));
        mahasiswa.add(new Mahasiswa(223455, "M.dzikri", "Teknik Industri", 23102022));
        mahasiswa.add(new Mahasiswa(234567, "Rudy", "Teknik Industri",23102022 ));


        System.out.println("-------------------------------{ Print All }----------------------------------------");
        mahasiswa.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("\n--------------------------------{ Remove }------------------------------------------");
        mahasiswa.remove(2);
        mahasiswa.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("\n---------------------------------{ Add }---------------------------------------------");
        mahasiswa.add(1, new Mahasiswa(234567, "Renaldi Setiawan", "Bisnis Dfital", 23102022));
        mahasiswa.forEach(mahasiswaa -> System.out.println(mahasiswaa));

        System.out.println("---------------------------------{ Size }-------------------------------------------");
        System.out.println("Total Mahasiswa : " + mahasiswa.size());
    }
}