class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        int[] countT = new int[128];
        int[] window = new int[128];

        for (char c : t.toCharArray()) {
            countT[c]++;
        }

        int have = 0;
        int need = t.length();
        int left = 0;

        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window[c]++;

            if (window[c] <= countT[c]) {
                have++;
            }

            while (have == need) {
                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;

                if (window[leftChar] < countT[leftChar]) {
                    have--;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(minStart, minStart + minLength);
    }
}