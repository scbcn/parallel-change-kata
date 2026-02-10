package com.pduda.field;

import org.junit.Assert;
import org.junit.Test;

public class ImagineThisIsAClientInADifferentRepositoryTest {

    /**
     * Why: Verify that the client correctly formats the total price for a given
     * input.
     */
    @Test
    public void singleItemNumberOfProductsInTheCart() throws Exception {
        ImagineThisIsAClientInADifferentRepository client = new ImagineThisIsAClientInADifferentRepository();

        Assert.assertEquals("Total price is 50 euro", client.formattedTotalPrice(50));
    }
}
