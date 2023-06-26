import org.junit.Test;
import static org.junit.Assert.*;

public class testToestemmingOpstijgenMetVoldoendeTegenwind {
    @Test
    public void testToestemmingOpstijgenMetVoldoendeTegenwind() {
        Cessna172 vliegtuig = new Cessna172(2000, 60, true,  3, true, true);
        vliegtuig.vraagToestemming();
        assertTrue(vliegtuig.heeftToestemming());
    }
}
