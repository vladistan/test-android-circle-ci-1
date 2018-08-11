package com.piggybank.mobile.test;

import com.piggybank.mobile.lang.Money;
import junit.framework.TestCase;

import java.util.Currency;
import java.util.Locale;

/**
 * Unit tests for Money class.
 */
public class MoneyTest extends TestCase {


    private Money money;

    @Override
    protected void setUp() throws Exception {

        money = new Money(12.011, Currency.getInstance("USD"));
    }


    public void testGetInitialAmount() {
        assertEquals(money.getCurrency().getSymbol(new Locale("en", "US")), "$");
        assertEquals(money.getAmount(), 12, 0.02);
    }

    public void testStringFormat() {
        assertEquals(money.toString(), "$12.01");
    }


}
