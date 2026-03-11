// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

// /**
//  * JUnit test for YerbaMate class
//  * @author Raul Soto
//  * @version 0.0.α
//  */
// class YerbaMateTest {

//     // YerbaMate objects will revert to this state after each test.
//     YerbaMate yerbaMate = new YerbaMate("Guayaki", 16, 4.50, 65, 0);
//     YerbaMate defaultYerbaMate = new YerbaMate();
//     YerbaMate copy = new YerbaMate(yerbaMate);
//     @Test
//     void getNumPasses() {
//         assertEquals(0, yerbaMate.getNumPasses());
//     }

//     @Test
//     void passMate() {
//         yerbaMate.passMate();
//         assertEquals(1, yerbaMate.getNumPasses());
//     }

//     @Test
//     void refill() {
//         yerbaMate.setOunces(0);
//         yerbaMate.refill(12);
//         assertEquals(12, yerbaMate.getOunces());
//     }

//     @Test
//     void testEquals() {
//         assertEquals(yerbaMate, new YerbaMate("Guayaki", 16, 4.50, 65, 0));
//         assertNotEquals(yerbaMate, new YerbaMate());
//     }


//     @Test
//     void testToString() {
//         assertTrue(yerbaMate.toString().contains("Guayaki"));
//     }
// }
