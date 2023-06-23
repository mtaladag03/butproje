package quickstart;


public class Cuzdan {
    private double bakiye;

    public void paraYukle(double miktar) {
        bakiye += miktar;
    }

    public void paraHarca(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
        } else {
            throw new IllegalArgumentException("Yetersiz bakiye!");
        }
    }

    public double bakiyeSorgula() {
        return bakiye;
    }
}




