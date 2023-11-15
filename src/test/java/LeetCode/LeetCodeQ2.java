package LeetCode;

public class LeetCodeQ2 {
    public static void main(String[] args) {
        int[][] twoDArray = {
                {1, 2},
                {4, 5},
                {7, 8}
        };
        System.out.println(minTimeToVisitAllPoints(twoDArray));
    }

    static int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;

        for (int i = 1; i < points.length; i++) {
            int x1 = points[i - 1][0];
            int y1 = points[i - 1][1];
            int x2 = points[i][0];
            int y2 = points[i][1];

            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);

            totalTime += Math.min(dx, dy) + Math.abs(dx - dy);
        }
        return totalTime;
    }
}
