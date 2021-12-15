package tigadimensi;
import duadimensi.PersegiPanjang;

public class Balok extends PersegiPanjang {
    double tinggi;

    public Balok (Double inputPanjang, Double inputLebar, Double inputTinggi ){
        super (inputPanjang, inputLebar);
        this.tinggi = inputTinggi;
    }

    public Double volume(){
        return super.luas() * tinggi;
    }
    
}
