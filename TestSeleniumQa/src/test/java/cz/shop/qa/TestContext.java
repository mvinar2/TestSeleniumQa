package cz.shop.qa;

import java.util.HashMap;

public class TestContext {
    static private HashMap<Long, ShopContext> testContext = new HashMap<>();

    public static void registerScenarioShop(long id, ShopContext shopContext) {
        testContext.put(id, shopContext);
    }

    public static ShopContext getScenarioShop(long id) {
        return testContext.get(id);
    }

    public static void removeScenarioShop(long id) {
        testContext.remove(id);
    }

    public static void removeAllScenarioShops() {
        testContext.clear();
    }
}
