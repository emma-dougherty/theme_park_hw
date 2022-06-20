import attractions.*;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    ParkingSpot parkingSpot;
    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;
    
    @Before
    public void before() {
        tobaccoStall = new TobaccoStall("Tobacco Stall", 2, "Timmy Tingles", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", 10, "Vanilla Ice", ParkingSpot.A4);
        candyflossStall = new CandyflossStall("Candy Land", 8, "Harry Belafonte", ParkingSpot.A1);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        playground = new Playground("Fun Zone", 7);
        park = new Park("Leafy Meadows", 9);
        dodgems = new Dodgems("Bumper Cars", 9);
        visitor1 = new Visitor(10, 120, 10);
        visitor2 = new Visitor(19, 210, 40);
        attractions = new ArrayList<Attraction>();
        attractions.add(rollerCoaster);
        attractions.add(dodgems);
        attractions.add(playground);
        attractions.add(park);
        stalls = new ArrayList<Stall>();
        stalls.add(candyflossStall);
        stalls.add(iceCreamStall);
        stalls.add(tobaccoStall);
        themePark = new ThemePark(attractions, stalls);
    }
    
    @Test
    public void hasAttractions(){
        assertEquals(4, themePark.getNumOfAttractions());
    }
    
    @Test
    public void hasStalls(){
        assertEquals(3, themePark.getNumOfStalls());
    }
    
    
}
