import org.junit.Test;
import static org.junit.Assert.*;

public class testBerekenKostenZwaarGewicht {
    @Test
    public void testBerekenKostenZwaarGewicht() {
        Cessna172 vliegtuig = new Cessna172(6000, 50, true,  2, false, false);
        double kosten = vliegtuig.berekenKosten();
        assertEquals(2500, kosten, 0.01);
    }
}
