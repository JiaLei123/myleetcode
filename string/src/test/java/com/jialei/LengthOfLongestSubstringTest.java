/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.jialei;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author jialei
 * @version : LengthOfLongestSubstringTest.java, v 0.1 2021年03月07日 10:46 下午 jialei Exp $
 */
public class LengthOfLongestSubstringTest {

    @Test
    public void testRun(){
        LengthOfLongestSubstring test = new LengthOfLongestSubstring();
        int length = test.lengthOfLongestSubstring("abcabcabc");
        Assert.assertEquals(length, 3);
    }
}