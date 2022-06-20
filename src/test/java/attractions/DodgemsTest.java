package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor = new Visitor(10, 1.1, 30);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }


    @Test
    public void setPrice() {
        assertEquals(4.5, dodgems.defaultPrice(), 0.0);
    }

    @Test
    public void priceForUnder12() {
        assertEquals(2.25, dodgems.priceFor(visitor), 0.0);
    }

}