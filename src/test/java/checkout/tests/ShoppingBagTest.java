package checkout.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alinka on 16.03.2016.
 */
public class ShoppingBagTest extends TestInit{

    @Test(enabled=false)
    public void restoreCart(){

        productViewPage.open("michael-kors-jet-set-travel-md-tote-pearl-grey");
        productViewPage.addProductToTheCart();
        shoppingBagPage.removeAllProductsFromCartAndSaveLastProductName();
        shoppingBagPage.restoreProduct();
        Assert.assertTrue(shoppingBagPage.checkCorrectProductRestored());

    }

    @Test
    public void removeAllProductsFromCart(){

        productViewPage.open("michael-kors-jet-set-travel-md-tote-pearl-grey");
        productViewPage.addProductToTheCart();
        productViewPage.open("burberry-0be-4178-58-331613");
        productViewPage.addProductToTheCart();
        productViewPage.open("abro-auto-5");
        productViewPage.addProductToTheCart();
        shoppingBagPage.removeAllProductsFromCart();
        shoppingBagPage.restoreProduct();

    }


}
