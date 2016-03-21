package checkout.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by roshchupkina on 3/21/2016.
 */
public class BuyWithDirectDebitTest extends TestInit {

    @Test
    public void rossChiliDillColeHagen() {

        productViewPage.open("abro-crac-dakar-leather-handbag-guncolor");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rachelBasilDillColeHagen();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();

    }

}
