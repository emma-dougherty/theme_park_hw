package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", 2, "Jack Jarvis", ParkingSpot.B1);
        visitor1 = new Visitor(10, 120, 10);
        visitor2 = new Visitor (19, 170, 40);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }
    @Test
    public void hasRating() {
        assertEquals(2, tobaccoStall.getRating());
    }
    
    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }
    
    @Test
    public void cannotAllowIfUnder18 (){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    }
    
    @Test
    public void canAllowIfOver18(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }
}
