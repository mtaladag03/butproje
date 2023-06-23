package quickstart;

public class CuzdanApi {
    private Cuzdan cuzdan;

    public CuzdanApi() {
        cuzdan = new Cuzdan();
    }

    public void paraYukle(double miktar) {
        cuzdan.paraYukle(miktar);
    }

    public void paraHarca(double miktar) {
        cuzdan.paraHarca(miktar);
    }

    public double bakiyeSorgula() {
        return cuzdan.bakiyeSorgula();
    }
}
