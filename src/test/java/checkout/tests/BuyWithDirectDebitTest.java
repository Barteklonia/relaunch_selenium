package checkout.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by roshchupkina on 3/21/2016.
 */
public class BuyWithDirectDebitTest extends TestInit {

    protected void goToLFTPaymentPage(){
        productViewPage.open("abro-crac-dakar-leather-handbag-guncolor");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rossChiliDillColeHagen();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        paymentPage.selectPayment("Lastschrift");
    }

    @Test
    public void checkErrorIsShownForInvalidAccountLFT() {
        goToLFTPaymentPage();
        Assert.assertTrue(directDebitPage.invalidATAccForDEStoreLFT());
        Assert.assertTrue(directDebitPage.invalidAccLengthLFT());
    }

    @Test
    public void checkBICisPrefilledAutomatically(){
            goToLFTPaymentPage();
        directDebitPage.checkBICisFilledAutomatically();
        Assert.assertEquals("Prefilled BIC is invalid", "COBADEFFXXX", directDebitPage.checkBICisFilledAutomatically());
    }

    @Test
    public void checkReviewPageIsShownForCorrectAccountLFT() {

        goToLFTPaymentPage();
        directDebitPage.enterIBAN();
        directDebitPage.submitData();
        Assert.assertTrue(reviewPage.checkPageIsOpened());
    }
}
