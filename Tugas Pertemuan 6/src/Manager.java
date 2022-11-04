public class Manager extends Pegawai {
    private double tunjangan;

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public void cetakInfo () {
        super.cetakInfo();
        cetakTunjangan();
    }

    public void cetakTunjangan() {
        setNama("Yuyun Fatimah");
        setGajiPokok(8000000);
        setTunjangan(6000000);

        System.out.println("Nama            : " + getNama());
        System.out.println("Gaji Pokok      : " + getGajiPokok());
        System.out.println("Tunjangan       : " + getTunjangan());
    }
}