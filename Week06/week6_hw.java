// leetcode 32
public class Solution {
    public int longestValidParentheses(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }
}


// leetcode 72
class Solution {
  public int minDistance(String word1, String word2) {
    int n = word1.length();
    int m = word2.length();

    // 有一个字符串为空串
    if (n * m == 0)
      return n + m;

    // DP 数组
    int [][] D = new int[n + 1][m + 1];

    // 边界状态初始化
    for (int i = 0; i < n + 1; i++) {
      D[i][0] = i;
    }
    for (int j = 0; j < m + 1; j++) {
      D[0][j] = j;
    }

    // 计算所有 DP 值
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < m + 1; j++) {
        int left = D[i - 1][j] + 1;
        int down = D[i][j - 1] + 1;
        int left_down = D[i - 1][j - 1];
        if (word1.charAt(i - 1) != word2.charAt(j - 1))
          left_down += 1;
        D[i][j] = Math.min(left, Math.min(down, left_down));

      }
    }
    return D[n][m];
  }
}
