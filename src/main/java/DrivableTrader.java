/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

public class DrivableTrader extends Trader<Drivable>{

    /**
     * Constructs a Drivable Trader, giving them the given inventory, wishlist and money
     *
     * @param inventory Objects in this trader's inventory
     * @param wishlist  Objects in this trader's wishlist
     * @param money     The amount of money this trader has
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money){
        super(inventory, wishlist, money);
    }

    /**
     * Constructs a Drivable Trader with empty inventory and wishlist
     *
     * @param money
     */
    public DrivableTrader(int money){
        super(money);

    }


    @Override
    public int getSellingPrice(Drivable obj){
        if (obj instanceof Tradable){
            return ((Tradable) obj).getPrice() + obj.getMaxSpeed();
        }
        return Tradable.MISSING_PRICE;
    }

}