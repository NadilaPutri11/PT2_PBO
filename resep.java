package model;

public class resep {
    private String namaMasakan;
    private String bahanUtama;
    private int lamaMemasak;
    
    public resep(String namaMasakan, String bahanUtama, int lamaMemasak) {
        this.namaMasakan = namaMasakan;
        this.bahanUtama = bahanUtama;
        this.lamaMemasak = lamaMemasak;
    }
    
    public String getNamaMasakan() {
        return namaMasakan;
    }
    
    public void setNamaMasakan(String namaMasakan) {
        this.namaMasakan = namaMasakan;
    }
    
    public String getBahanUtama() {
        return bahanUtama;
    }
    
    public void setBahanUtama(String bahanUtama) {
        this.bahanUtama = bahanUtama;
    }
    
    public int getLamaMemasak() {
        return lamaMemasak;
    }
    
    public void setLamaMemasak(int lamaMemasak) {
        this.lamaMemasak = lamaMemasak;
    }
    
    @Override
    public String toString() {
        return namaMasakan + " | Bahan: " + bahanUtama + " | Lama: " + lamaMemasak + " menit";
    }
}