package com.acelopez.jdk7;

import com.acelopez.jdk7.coin.Coin;
import org.junit.Test;

import static com.acelopez.jdk7.coin.Coin.VENDOR_ID_ORACLE;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CoinTest {

    @Test
    public void test_mapString_vendor_from_constants() {
        String pVendor = Coin.VENDOR_NAME_ORACLE;

        int id = Coin.mapVendorId(pVendor);

        assertThat(id, is(VENDOR_ID_ORACLE));
    }

    @Test
    public void test_mapString_any_other_vendor() {
        String pVendor = "ANY";

        int id = Coin.mapVendorId(pVendor);

        assertThat(id, is(-1));
    }
}