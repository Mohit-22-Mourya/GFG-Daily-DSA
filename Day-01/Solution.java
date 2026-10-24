
class Solution {
    public boolean isPossible(int n, int m, String s) {
        int cur_i = 0, cur_j = 0;
        int min_i = 0, max_i = 0;
        int min_j = 0, max_j = 0;

        for (int k = 0; k < s.length(); k++) {
            char ch = s.charAt(k);

            if (ch == 'L') {
                cur_j--;
            } else if (ch == 'R') {
                cur_j++;
            } else if (ch == 'U') {
                cur_i++;
            } else if (ch == 'D') {
                cur_i--;
            }

            min_i = Math.min(min_i, cur_i);
            max_i = Math.max(max_i, cur_i);
            min_j = Math.min(min_j, cur_j);
            max_j = Math.max(max_j, cur_j);
        }

        return (max_i - min_i < n)
                && (max_j - min_j < m);
    }
}
