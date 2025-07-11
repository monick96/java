package utils;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void TestRepeat() {

        System.out.println(StringUtil.repeatString("pruebita", 5));
        Assert.assertEquals("pruebitapruebitapruebitapruebitapruebita",StringUtil.repeatString("pruebita", 5));
        Assert.assertEquals("pruebitapruebita",StringUtil.repeatString("pruebita", 2));

    }

}