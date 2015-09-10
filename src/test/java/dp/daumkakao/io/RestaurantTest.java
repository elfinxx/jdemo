package dp.daumkakao.io;

import org.junit.Before;
import org.junit.Test;

public class RestaurantTest {

    private Restaurant restaurant;
    @Before
    public void setUp() throws Exception {
        restaurant = new Restaurant();
    }

    @Test
    public void testAddMenu() throws Exception {
        restaurant.addMenu(new Menu());
    }
}