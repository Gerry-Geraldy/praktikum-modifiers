package duadimensi;

public class Trapesium{
    double sisibawah;
    double sisiatas;
    double tinggi;

    public Trapesium(double sisiatas, double sisibawah, double tinggi){
        this.sisiatas = sisiatas;
        this.sisibawah = sisibawah;
        this.tinggi = tinggi;
    } 

    public double luas(){
        return (sisiatas + sisibawah) * tinggi / 2;
    }
}