package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(12, 1.2, 10);
        visitor2 = new Visitor(30, 2.8, 400);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canVisitorEnter() {
        assertEquals(true,rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void defaultPrice() {
        assertEquals(8.4, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void priceForTallVisitors() {
        assertEquals(16.8, rollerCoaster.priceFor(visitor2), 0.0);
    }
}