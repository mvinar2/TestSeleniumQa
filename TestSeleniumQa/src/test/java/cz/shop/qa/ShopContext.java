package cz.shop.qa;

import java.util.Date;
import java.util.HashMap;

public class ShopContext {
    private final String shopName;
    private final Date testStart;
    private Date testEnd;
    private HashMap<String, Object> generalShopObjectStore = new HashMap<>();

    public ShopContext(String shopName) {
        this.shopName = shopName;
        this.testStart = new Date();
    }

    public void setTestEnd(Date testEnd) {
        this.testEnd = testEnd;
    }

    public String getShopName() {
        return shopName;
    }

    public Date getTestStart() {
        return testStart;
    }

    public Date getTestEnd() {
        return testEnd;
    }

    public void saveShopObject(String id, Object object) {
        generalShopObjectStore.put(id, object);
    }

    public Object getShopObject(String id) {
        return generalShopObjectStore.get(id);
    }

    public void removeShopObject(String id) {
        generalShopObjectStore.remove(id);
    }

    public void cleanAllShopObjects() {
        generalShopObjectStore.clear();
    }
}
