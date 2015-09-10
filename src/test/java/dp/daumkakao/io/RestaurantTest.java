package dp.daumkakao.io;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {

    private Restaurant restaurant;
    
    @Before
    public void setUp() {
        restaurant = new Restaurant();
    }
    
//    @org.junit.Test
    public void testGetMenuList() throws Exception {
        

    }

    @org.junit.Test
    public void testAddMenu() throws Exception {
        restaurant.addMenu(new Menu());
        assertEquals(1, restaurant.getMenuList().size());
    }
}