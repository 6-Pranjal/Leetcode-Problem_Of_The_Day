class june3 {
    public int appendCharacters(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        int ans = 0;
        int count = 0;
        int n1 = S.length;
        int n2 = T.length;

        if (n1 == 1 && n2 == 1) {
            if (S[0] == T[0]) {
                return 0;
            } else {
                return 1;
            }
        }

        else if (n1 == 1) {
            if (S[0] != T[0]) {
                ans = n2;
                return ans;
            } else {
                ans = n2 - 1;
                return ans;
            }
        }

        else if (n2 == 1) {
            for (int i = 0; i < n1; i++) {
                if (T[0] == S[i]) {
                    count = 0;
                    break;
                } else {
                    count++;
                }
            }
            return count == 0 ? 0 : 1;
        }

        else {
            int j = 0;
            for (int i = 0; i < n1; i++) {
                if (T[j] == S[i]) {
                    count++;
                    j++;
                }
            }
            ans = n2 - count;
        }
        return ans;

    }
}