package checkout.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by Alinka on 17.03.2016.
 */
public class CheckoutTest extends TestInit {

    @Test
    public void paymentOverview() {

        productViewPage.open("michael-kors-jet-set-travel-md-tote-pearl-grey");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rachelBasilDillColeHagen();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        paymentPage.checkPaymentList();
    }
}