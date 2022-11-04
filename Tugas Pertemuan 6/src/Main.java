public class Main {
    public static void main(String[] args) {

        Pegawai manager = new Manager();
        Pegawai programmer = new Programmer();

        manager.cetakInfo();

        System.out.println();

        programmer.cetakInfo();
    }
}