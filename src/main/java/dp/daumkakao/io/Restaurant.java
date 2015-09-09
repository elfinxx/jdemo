package dp.daumkakao.io;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raee on 15. 9. 9..
 */
public class Restaurant {
    private List<Menu> menuList;
    public Restaurant() {
        this.menuList = new ArrayList<>();
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void addMenu(Menu menu) {
        this.menuList.add(menu);
    }
}
