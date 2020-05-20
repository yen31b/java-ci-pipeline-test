import junit.framework.TestCase;

public class MainTest extends TestCase{

    private Main m;

    public void escenario (){
        m = new Main();
    }

    public void testsumar (){
        escenario();
        assertTrue(m.sumar(2 , 2) == (2 + 2));
    }

    public void testrestar (){
        escenario();
        assertTrue(m.restar(5 , 2 ) == (5-2));
    }

    public void testmulti (){
        escenario();
        assertTrue( m.multiplicar(2 , 3 ) == (2*3));
    }

    public void testdividir (){
        escenario();
        assertTrue( m.dividir(6 , 2 ) == (6/2));
    }

}