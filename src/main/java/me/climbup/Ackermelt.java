package me.climbup;

class Ackermelt {
    public static int ack(int m, int n) {
        int ans = 0;
        if (m == 0) { ans = n + 1; }
        if (m > 0 && n == 0) {
            ans = ack(m - 1, 1);
        }
        if (m > 0 && n > 0) {
            ans = ack(m - 1, ack(m, n - 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; ++j) {
                System.out.println(String.format("ack(%d, %d) is ", i, j) + Integer.toString(ack(i, j)));
            }
        }
    }
}
