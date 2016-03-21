package checkout.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Alinka on 17.03.2016.
 */
public class AvailablePaymentsTest extends TestInit {

    @Test
    public void rachelBasilDillColeHagen() {

        productViewPage.open("abro-clutch-leather-snake-for-test");
        productViewPage.addProductToTheCart();
        productViewPage.open("miu-miu-for-auto-test-3-euro");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rachelBasilDillColeHagen();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("RATENKAUF", "RECHNUNG", "KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void fibiBasilDillColeHagen() {

        productViewPage.open("aigner-flexible-shopper-m-ebony");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.fibiBasilDillColeHagen();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("RATENKAUF", "RECHNUNG", "KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void fibiBasilDillColeIkea() {

        productViewPage.open("aigner-flexible-shopper-m-ebony");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.fibiBasilDillColeIkea();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("RATENKAUF", "RECHNUNG", "KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void joeyBasilDillColeUlm() {

        productViewPage.open("burberry-camel-check-silk-scarf");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.joeyBasilDillColeUlm();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("RATENKAUF", "RECHNUNG", "KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void chandlerBasilDillColeUlm() {

        productViewPage.open("miu-miu-st-cocco-lux-cipria");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.chandlerBasilDillColeUlm();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("RATENKAUF", "RECHNUNG", "KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void rossBasilDillColeUlm() {

        productViewPage.open("prada-secchiello-city-calf-cacao");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rossBasilDillColeUlm();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void rossChiliDillColeHagen() {

        productViewPage.open("abro-crac-dakar-leather-handbag-guncolor");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rossChiliDillColeHagen();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("RATENKAUF", "KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG", "LASTSCHRIFT"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void rossBasilDillTomatoUlm() {

        productViewPage.open("abro-crac-dakar-leather-handbag-guncolor");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rossBasilDillTomatoUlm();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("RATENKAUF", "RECHNUNG", "KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void rossChiliPaprikaColeHagen() {

        productViewPage.open("abro-crac-dakar-leather-handbag-guncolor");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rossChiliPaprikaColeHagen();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("RATENKAUF", "KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG", "LASTSCHRIFT"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void rossChiliPaprikaTomatoUlm() {

        productViewPage.open("abro-crac-dakar-leather-handbag-guncolor");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.rossChiliPaprikaTomatoUlm();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void monikaChiliPaprikaTomatoUlm() {

        productViewPage.open("burberry-0be-4178-58-331613");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.monikaChiliPaprikaTomatoUlm();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void monikaBasilDillColeAachen() {

        productViewPage.open("prada-secchiello-city-calf-cacao");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.monikaBasilDillColeAachen();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("RATENKAUF", "KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG", "LASTSCHRIFT"),
                paymentPage.checkActualPaymentList());
    }

    @Test
    public void monikaBasilDillTomatoOldenburg() {

        productViewPage.open("prada-secchiello-city-calf-cacao");
        productViewPage.addProductToTheCart();
        shoppingBagPage.goToAddressPage();
        addressPage.monikaBasilDillTomatoOldenburg();
        addressPage.submitAddressData();
        addressPage.addressDocAccept();
        Assert.assertEquals("Payments are not as expected",
                Arrays.asList("KREDITKARTE", "PAYPAL", "SOFORT-ÜBERWEISUNG"),
                paymentPage.checkActualPaymentList());
    }
}