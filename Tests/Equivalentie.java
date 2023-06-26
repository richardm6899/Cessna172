import org.junit.Test;
import static org.junit.Assert.*;

public class Equivalentie {

        @Test
        public void testBerekenKosten() {

            Cessna172 test1 = new Cessna172(100, 60, true);
            double kosten1 = test1.berekenKosten();
            assertEquals(100, kosten1, 1);

            Cessna172 test2 = new Cessna172(300, 60, true);
            double kosten2 = test2.berekenKosten();
            assertEquals(100, kosten2, 1);

            Cessna172 test3 = new Cessna172(900, 60, true);
            double kosten3 = test3.berekenKosten();
            assertEquals(100, kosten3, 1);

            Cessna172 test4 = new Cessna172(1100, 60, true);
            double kosten4 = test4.berekenKosten();
            assertEquals(500, kosten4, 1);

            Cessna172 test5 = new Cessna172(2300, 60, true);
            double kosten5 = test5.berekenKosten();
            assertEquals(500, kosten5, 1);

            Cessna172 test6 = new Cessna172(4000, 60, true);
            double kosten6 = test6.berekenKosten();
            assertEquals(500, kosten6, 1);

            Cessna172 test7 = new Cessna172(7500, 60, true);
            double kosten7 = test7.berekenKosten();
            assertEquals(2500, kosten7, 1);

            Cessna172 test8 = new Cessna172(10000, 60, true);
            double kosten8 = test8.berekenKosten();
            assertEquals(2500, kosten8, 1);
        }
    }

