public class Programmer extends Pegawai {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        cetakBonus();
    }
    public void cetakBonus() {
        setNama("Anggit");
        setGajiPokok(5000000);
        setBonus(2000000);

        System.out.println("Nama            : " + getNama());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
        System.out.println("Bonus           : " + getBonus());
    }
}