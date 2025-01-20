import java.util.Scanner;
public class tugasMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tugas tugas= new tugas();
        
        System.out.println("masukan nama siswa");
        tugas.setNama(scanner.nextLine());

        System.out.println("masukan usia siswa");
        tugas.setUsia(scanner.nextInt());

        System.out.println("masukan nilai rata2 siswa");
        tugas.setNilai(scanner.nextDouble());

        System.out.println("nama siswa: " + tugas.GetNama());
        System.out.println("usia: " + tugas.getUsia());
        System.out.println("nilai rata rata siswa: " + tugas.getNilai());

    }
}
