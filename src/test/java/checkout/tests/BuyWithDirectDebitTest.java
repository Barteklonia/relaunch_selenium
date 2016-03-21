package checkout.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by roshchupkina on 3/21/2016.
 */
public class BuyWithDirectDebitTest extends TestInit {

    @Test
    public void checkErrorIsShownForInvalidAccountLFT() {

        productViewPage.open("abro-crac-dakar-leather-handbag-guncolor");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rachelBasilDillColeHagen();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        paymentPage.selectPayment("Lastschrift");
        Assert.assertTrue(directDebitPage.invalidATAccForDEStoreLFT());
        Assert.assertTrue(directDebitPage.invalidAccLengthLFT());
    }

    @Test
    public void checkReviewPageIsShownForCorrectAccountLFT() {

        productViewPage.open("abro-crac-dakar-leather-handbag-guncolor");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rachelBasilDillColeHagen();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        paymentPage.selectPayment("Lastschrift");

    }
}
