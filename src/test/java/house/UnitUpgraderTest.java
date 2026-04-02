package house;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UnitUpgraderTest {
    private static final UnitUpgrader upgrader = new UnitUpgrader();

    @Test
    public void testUpgraderIncreasesSquareFootageOfPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);

        upgrader.upgrade(penthouse);

        assertEquals(1540, penthouse.getSquareFootage());
    }

    @Test
    public void testUpgraderAddsBedroomToApartment() {
        PenthouseSuite penthouse = new PenthouseSuite();

        upgrader.upgrade(penthouse);

        assertEquals(5, penthouse.getNumberOfBedrooms());
    }

    @Test
    public void testUpgraderIncreasesSquareFootageOfStudio() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);

        upgrader.upgrade(studio);

        assertEquals(590, studio.getSquareFootage());
    }

    @Test
    public void testUpgraderDoesntAddBedroomToStudios() {
        Studio studio = new Studio();

        upgrader.upgrade(studio);

        assertEquals(0, studio.getNumberOfBedrooms());
    }
}
