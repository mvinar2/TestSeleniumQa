package cz.shop.qa.pageobjects;

/**
 * General interface for shop search
 * @author vinar.marek@gmail.com
 */
public interface ISearch extends IPage {

    /**
     * Shop product search field functionality. Search by text for example product name or product area etc.
     * No all shops have implemented this search functionality. There is possible raise exception if this functionality
     * is not supported for given shop or implement other behaviour of method for given shop
     * @param searchText text search for
     * @throws IllegalStateException exception if this functionality failed or not supported for given shop
     */
    public void useSearchTextInputField(String searchText) throws IllegalStateException;

    /**
     * Search result is possible to sort by shop defined visible sort criteria like price, product recommendation etc.
     * No all shops have implemented this feature so implementation can raise exception or change behavior of this method
     * @param searchCriteriaText test search criteria
     * @throws IllegalStateException exception if this functionality failed or not supported for given shop
     */
    public void sortSearchResultByVisibleTextCriteria(String searchCriteriaText) throws IllegalStateException;

}
