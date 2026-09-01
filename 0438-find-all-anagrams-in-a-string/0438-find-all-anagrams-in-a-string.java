import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] count = new int[26];

        for (char ch : p.toCharArray()) {
            count[ch - 'a']++;
        }

        int left = 0;
        int needed = p.length();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            if (count[current - 'a']-- > 0) {
                needed--;
            }

            if (right - left + 1 > p.length()) {
                char removed = s.charAt(left++);

                if (count[removed - 'a']++ >= 0) {
                    needed++;
                }
            }

            if (needed == 0) {
                result.add(left);
            }
        }

        return result;
    }
}