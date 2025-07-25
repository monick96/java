package utils;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringUtilTest {
    @Test
    public void TestRepeatZeroTime() {

        Assert.assertEquals("",StringUtil.repeatString("pruebita", 0));

    }

    @Test
    public void TestRepeatOneTime() {

        Assert.assertEquals("pruebita",StringUtil.repeatString("pruebita", 1));

    }

    @Test
    public void TestRepeatMultipleTime() {

        //System.out.println(StringUtil.repeatString("pruebita", 5));
        Assert.assertEquals("pruebitapruebitapruebitapruebitapruebita",StringUtil.repeatString("pruebita", 5));

    }

    @Test(expected = IllegalArgumentException.class)
    public void TestRepeatNegativeTime() {

        Assert.assertEquals("hola",StringUtil.repeatString("pruebita", -5));

    }

    @Test
    public void trueWhenTextEmpty(){

        boolean result = StringUtil.isEmpty("");

        assertTrue(result);
    }

    @Test
    public void trueWhenTextNull(){

        boolean result = StringUtil.isEmpty(null);

        assertTrue(result);
    }

    @Test
    public void trueWhenTextHaveOnlySpace(){

        boolean result = StringUtil.isEmpty("       ");

        assertTrue(result);
    }

    @Test
    public void falseWhenTextHaveSpaceAndCharts(){

        boolean result = StringUtil.isEmpty("       LOLA");

        assertFalse(result);
    }

}