/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.jialei;

import org.jetbrains.annotations.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jialei
 * @version : LengthOfLongestSubstring.java, v 0.1 2021年03月07日 10:46 下午 jialei Exp $
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(@NotNull String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(alpha, end + 1);
        }
        return ans;
    }


}