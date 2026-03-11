// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// /**
//  * JUnit test for CaffeinatedBeverage class
//  * @author Raul Soto
//  * @version 0.0.α
//  */
// class CaffeinatedBeverageTest {
//     // CaffeneitedBeverage object will always revert to this state after each test. I don't know if that is prefered.
//     CaffeinatedBeverage beverage = new CaffeinatedBeverage("Coffee", 16, 3.50);
//     CaffeinatedBeverage defaultBeverage = new CaffeinatedBeverage();
//     CaffeinatedBeverage copy = new CaffeinatedBeverage(beverage);


//     @Test
//     void testGetName() {
//         assertEquals("Coffee", beverage.getName());
//     }

//     @Test
//     void testGetOunces() {
//         assertEquals(16, beverage.getOunces());
//     }

//     @Test
//     void testGetPrice() {
//         assertEquals(3.50, beverage.getPrice());
//     }

//     @Test
//     void testSetName() {
//         beverage.setName("Espresso");
//         assertEquals("Espresso", beverage.getName());
//     }

//     @Test
//     void testSetOunces() {
//         beverage.setOunces(20);
//         assertEquals(20, beverage.getOunces());
//     }

//     @Test
//     void testSetPrice() {
//         beverage.setPrice(4.50);
//         assertEquals(4.50, beverage.getPrice());
//     }

//     @Test
//     void testSetAll() {
//         assertFalse(beverage.setAll("Cappuccino", -12, 3.50));
//         assertFalse(beverage.setAll("Cappuccino", 12, -3.50));
//         assertTrue(beverage.setAll("Cappuccino", 12, 3.50));
//         assertEquals("Cappuccino", beverage.getName());
//         assertEquals(12, beverage.getOunces());
//         assertEquals(3.50, beverage.getPrice());
//     }

//     @Test
//     void testEquals() {
//         beverage.setAll("Cappuccino", 12, 3.50);
//         assertEquals(beverage, new CaffeinatedBeverage("Cappuccino", 12, 3.50));
//         assertNotEquals(beverage, new CaffeinatedBeverage());
//     }

//     @Test
//     void testToString() {
//         System.out.println(beverage);
//     }

//     @Test
//     void testSip() {
//         int sip = 8;
//         beverage.setOunces(sip);
//         assertTrue(beverage.sip(sip - 1));
//         assertFalse(beverage.sip(sip + 1));
//     }

//     @Test
//     void testIsEmpty() {
//         System.out.println(beverage);
//         assertFalse(beverage.isEmpty());
//         beverage.sip(beverage.getOunces());
//         assertEquals(0, beverage.getOunces());
//         assertTrue(beverage.isEmpty());
//     }
// }

public class CaffeinatedBeverageTest {
    public static void main(String[] args){
        // CaffeinatedBeverage badTest = new CaffeinatedBeverage("Morning cup ", -16, -0.99);
        CaffeinatedBeverage goodTest = new CaffeinatedBeverage("Morning cup ", 16, 0.99);

        

        //System.out.println("Bad test beverage= "+goodest);
        System.out.println("Good test beverage= "+goodTest);
    }
}