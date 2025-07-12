package utils;
import org.junit.Assert;
import org.junit.Test;

import static utils.PaswordUtil.LevelPassword.*;

public class PaswordUtilTest {

    @Test
    public void weakLevelWhenLess8Char() {
        Assert.assertEquals(WEAK, PaswordUtil.levelSecurityPassword("46546548"));
    }

    @Test
    public void weakLevelWhenOnlyLetters() {
        Assert.assertEquals(WEAK, PaswordUtil.levelSecurityPassword("ppppppppkjhn"));
    }

    @Test
    public void mediumLevelWhenLettersAndNumbersAndMore8() {
        Assert.assertEquals(MEDIUM, PaswordUtil.levelSecurityPassword("pp9pkjhn29"));
    }

    @Test
    public void strongLevelWhenLettersAndNumbersAndMore10() {
        Assert.assertEquals(STRONG, PaswordUtil.levelSecurityPassword("ppp66pppkjhn29"));
    }
}