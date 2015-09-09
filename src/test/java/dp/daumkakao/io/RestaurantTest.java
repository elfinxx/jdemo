package dp.daumkakao.io;

import org.junit.Before;
import org.junit.Test;

public class RestaurantTest {

    private Restaurant restaurant;
    @Before
    public void setUp() throws Exception {
        this.restaurant = new Restaurant();
    }

//    @Test
    public void testGetMenuList() throws Exception {

    }

    @Test
    public void testAddMenu() throws Exception {
        restaurant.addMenu(new Menu());
        System.out.println(restaurant.getMenuList().size());
    }
}