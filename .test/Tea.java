// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// /**
//  * JUnit test for Tea class
//  * @author Raul Soto
//  * @version 0.1.α
//  */
// class TeaTest {

//     // Tea object will revert to this state after each test.
//     Tea tea = new Tea("Earl Grey", 12, 2.50, 80);
//     Tea defaultTea = new Tea();
//     Tea copy = new Tea(tea);

//     @Test
//     void testGetBrewTemp() {
//         assertEquals(80, tea.getBrewTemp());
//     }

//     @Test
//     void testSetBrewTemp() {
//         assertFalse(tea.setBrewTemp(-1));
//         assertTrue(tea.setBrewTemp(75));
//         assertEquals(75, tea.getBrewTemp());
//     }

//     @Test
//     void testSetAll() {
//         assertFalse(tea.setAll("Chamomile", -10, 2.00, 170));
//         assertFalse(tea.setAll("Chamomile", 10, -2.00, 170));
//         assertFalse(tea.setAll("Chamomile", 10, 2.00, -170));
//         assertTrue(tea.setAll("Chamomile", 10, 2.00, 170));
//         assertEquals("Chamomile", tea.getName());
//         assertEquals(10, tea.getOunces());
//         assertEquals(2.00, tea.getPrice());
//         assertEquals(170, tea.getBrewTemp());
//     }


//     @Test
//     void testEquals() {
//         assertEquals(tea, new Tea("Earl Grey", 12, 2.50, 80));
//         assertNotEquals(tea, new Tea());
//     }

//     @Test
//     void testToString() {
//         assertTrue(tea.toString().contains("Earl Grey"));
//     }
public class Tea extends CaffeinatedBeverage {
    public static final int DEFAULT_BREW_TEMP = 90;

    private int brewTemp;

    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        if (!this.setBrewTemp(brewTemp)) {
            System.out.println("ERROR: Bad data given to full Tea constructor.");
            System.exit(0);
        }
    }

    public Tea() {
        super();
        this.setBrewTemp(DEFAULT_BREW_TEMP);
    }

    public Tea(Tea original) {
        if (original != null) {
            this.setAll(original.getName(), original.getOunces(), original.getPrice(), original.brewTemp);
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || other instanceof Tea) {
            return false;
        }
        Tea otherTea = (Tea) other;
        return super.equals(otherTea)&&this.brewTemp==otherTea.brewTemp;
    }

    @Override
    public String toString() {
        String caffeineString = super.toString();
        int colonLocation = caffeineString.indexOf(":");
        caffeineString = caffeineString.substring(colonLocation + 2);

        return String.format("Tea: %s, brewed @ %d°C", caffeineString, this.brewTemp);
    }

    public boolean setBrewTemp(int brewTemp) {
        if (brewTemp > 0) {
            this.brewTemp = brewTemp;
            return true;
        } else {
            return false;
        }
    }

    public boolean setAll(String name, int ounces, double price, int brewTemp) {
        return super.setAll(name, ounces, price)&& this.setBrewTemp(brewTemp);
    }
}