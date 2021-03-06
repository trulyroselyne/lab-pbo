import java.util.Scanner;
public class Main {
    static Scanner rex = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Nama         ::> ");
        String name = rex.nextLine();
        System.out.print("NIM          ::> ");
        String nim = rex.next().toUpperCase();
        System.out.print("Kelas        ::> ");
        String kelas = rex.next();
        System.out.print("Mata Kuliah  ::> ");
        rex.nextLine();
        String matkul = rex.nextLine();
        System.out.print("Nilai UTS    ::> ");
        int uts = rex.nextInt();
        System.out.print("Nilai UAS    ::> ");
        int uas = rex.nextInt();

        Mahasiswa mahasiswa = new Mahasiswa(name, nim, matkul, uas, uts);

        if(matkul.equalsIgnoreCase("PBO") || matkul.equalsIgnoreCase("Pemrograman Berbasis Objek")){
            mahasiswa.info();
            mahasiswa.prodi("Supri Amir, S.T, M.Eng", 3);
            mahasiswa.nilai();
        }else if(matkul.equalsIgnoreCase("MatDas2") || matkul.equalsIgnoreCase("Matematika Dasar 2")){
            mahasiswa.info();
            mahasiswa.prodi("Dr. Armin Lawi, S.Si, M.Eng", 3);
            mahasiswa.nilai();
        }else if(matkul.equalsIgnoreCase("AlLin") || matkul.equalsIgnoreCase("Aljabar Linear")){
            mahasiswa.info();
            mahasiswa.prodi("Nurdin, S.Si, M.Si", 3);
            mahasiswa.nilai();
        }else if(matkul.equalsIgnoreCase("MetStat") || matkul.equalsIgnoreCase("Metode Statistika")){
            mahasiswa.info();
            mahasiswa.prodi("Dr. Nurtiti Sunusi, S.Si, M.Si", 3);
            mahasiswa.nilai();
        }else if(matkul.equalsIgnoreCase("Ipteks") || matkul.equalsIgnoreCase("Wawasan Ipteks")){
            mahasiswa.info();
            mahasiswa.prodi("Dr. Sri Suryani, DEA", 2);
            mahasiswa.nilai();
        }else if(matkul.equalsIgnoreCase("KN") || matkul.equalsIgnoreCase("Kewarganegaraan")){
            mahasiswa.info();
            mahasiswa.prodi("Irham, S.Si, M.Si", 2);
            mahasiswa.nilai();
        }else if(matkul.equalsIgnoreCase("Technopreneurship") || matkul.equalsIgnoreCase("technoprenership")){
            mahasiswa.info();
            mahasiswa.prodi("Dr. Diaraya, M.Ak", 2);
            mahasiswa.nilai();
        }else if(matkul.equalsIgnoreCase("Bing") || matkul.equalsIgnoreCase("Bahasa Inggris")){
            mahasiswa.info();
            mahasiswa.prodi("Sukmawati Marzuki", 2);
            mahasiswa.nilai();
        }else{
            System.out.println("ndada");
        }


    }
}