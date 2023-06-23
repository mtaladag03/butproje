package quickstart;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CuzdanApiTest {

    private CuzdanApi c�zdanApi;

    @Before
    public void setUp() {
        c�zdanApi = new CuzdanApi();
    }

    @Test
    public void testParaY�kle() {
        c�zdanApi.paraYukle(100);
        assertEquals(100, c�zdanApi.bakiyeSorgula(), 0.001);
    }

    @Test
    public void testParaHarca() {
        c�zdanApi.paraYukle(100);
        c�zdanApi.paraHarca(50);
        assertEquals(50, c�zdanApi.bakiyeSorgula(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParaHarcaYetersizBakiye() {
        c�zdanApi.paraYukle(30); 
        c�zdanApi.paraHarca(50);
    }
}

