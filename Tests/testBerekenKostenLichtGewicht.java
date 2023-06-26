import org.junit.Test;
import static org.junit.Assert.*;

public class testBerekenKostenLichtGewicht {
    @Test
    public void testBerekenKostenLichtGewicht() {
        Cessna172 vliegtuig = new Cessna172(800, 30, true,2, false, false);
        double kosten = vliegtuig.berekenKosten();
        assertEquals(100.0, kosten, 0.01);
    }
}
