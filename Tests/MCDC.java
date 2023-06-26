import org.junit.Test;
import static org.junit.Assert.*;

public class MCDC {


        @Test
        public void testHeeftToestemming() {

            Cessna172 test1 = new Cessna172(900, 60, true, 3, true, true);
            test1.vraagToestemming();
            assertTrue(test1.heeftToestemming());


            Cessna172 test3 = new Cessna172(1100, 55, true, 1, true, false);
            test3.vraagToestemming();
            assertTrue(test3.heeftToestemming());


            Cessna172 test5 = new Cessna172(800, 40, true, 5, false, false);
            test5.vraagToestemming();
            assertTrue(test5.heeftToestemming());


            Cessna172 test7 = new Cessna172(1200, 30, true, 2, false, true);
            test7.vraagToestemming();
            assertFalse(test7.heeftToestemming());
        }

    }


