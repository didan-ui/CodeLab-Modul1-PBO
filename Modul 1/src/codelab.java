import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class codelab {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //input nama
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();

        //input jenis kelamin
        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenis = scan.next().charAt(0);
        String kelamin = (jenis == 'L' || jenis == 'l') ? "Laki-Laki" : "Perempuan";

        //input tanggal lahir
        System.out.print("Masukkan Tanggal Lahir (Tahun-Bulan-Tanggal): ");
        String tgllahir1 = scan.next();
        LocalDate tgllahir2 = LocalDate.parse(tgllahir1, DateTimeFormatter.ISO_DATE);

        //hitungan umur
        LocalDate tglsekarang = LocalDate.now();
        Period selisihumur = Period.between(tgllahir2, tglsekarang);
        int umurtahun = selisihumur.getYears();
        int umurbulan = selisihumur.getMonths();

        //output data diri
        System.out.println(" ");
        System.out.println("Data Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + kelamin);
        System.out.println("Tanggal Lahir: " + tgllahir2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Umur: " + umurtahun + " Tahun " + umurbulan + " Bulan");

        scan.close();

    }
}