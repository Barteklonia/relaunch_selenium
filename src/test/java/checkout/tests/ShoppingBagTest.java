package checkout.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alinka on 16.03.2016.
 */
public class ShoppingBagTest extends TestInit{

    @Test
    public void restoreCart(){

        productViewPage.open("michael-kors-jet-set-travel-md-tote-pearl-grey");
        productViewPage.addProductToTheCart();
        shoppingBagPage.removeAllProductsFromCartAndSaveLastProductName();
        shoppingBagPage.restoreProduct();
        Assert.assertTrue(shoppingBagPage.checkCorrectProductRestored());

    }


}
