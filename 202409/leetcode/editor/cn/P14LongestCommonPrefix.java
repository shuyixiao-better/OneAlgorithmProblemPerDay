package editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * Copyright © 2024年 integration-projects-maven. All rights reserved.
 * ClassName P14LongestCommonPrefix.java
 * author 舒一笑 yixiaoshu88@163.com
 * version 1.0.0
 * Description TODO
 * createTime 2024年09月09日 12:34:00
 */
public class P14LongestCommonPrefix {
    public static void main(String[] args){
        Solution solution = new P14LongestCommonPrefix().new Solution();
        System.out.printf(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            String prefix = strs[0];
            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }
            return prefix;
        }
    }
}
