package quickstart;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CuzdanApiTest {

    private CuzdanApi cüzdanApi;

    @Before
    public void setUp() {
        cüzdanApi = new CuzdanApi();
    }

    @Test
    public void testParaYükle() {
        cüzdanApi.paraYukle(100);
        assertEquals(100, cüzdanApi.bakiyeSorgula(), 0.001);
    }

    @Test
    public void testParaHarca() {
        cüzdanApi.paraYukle(100);
        cüzdanApi.paraHarca(50);
        assertEquals(50, cüzdanApi.bakiyeSorgula(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParaHarcaYetersizBakiye() {
        cüzdanApi.paraYukle(30); 
        cüzdanApi.paraHarca(50);
    }
}

