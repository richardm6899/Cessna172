import org.junit.Test;
import static org.junit.Assert.*;
public class Pairwise {

        @Test
        public void testBerekenKosten() {
            Cessna172 test1 = new Cessna172(200, 60, true, 1, true, true);
            double kosten1 = test1.berekenKosten();
            assertEquals(1089, kosten1, 0);

            Cessna172 test2 = new Cessna172(2000, 60, true, 3, false, true);
            double kosten2 = test2.berekenKosten();
            assertEquals(907.5, kosten2, 0);

            Cessna172 test3 = new Cessna172(6000, 60, true, 5, true, false);
            double kosten3 = test3.berekenKosten();
            assertEquals(4550, kosten3, 0);
        }
    }

