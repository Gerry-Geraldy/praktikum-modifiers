package duadimensi;

public class BelahKetupat{
    double diagonal;

    public BelahKetupat(Double diagonal){
        this.diagonal = diagonal;
    }

    public Double luas(){
        return 0.5 * diagonal * diagonal;
    }

    // public Double luas(){
    //     return diagonal * diagonal /2;
    // }
}