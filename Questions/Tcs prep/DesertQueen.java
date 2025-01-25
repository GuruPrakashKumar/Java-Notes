import java.util.*;

public class DesertQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] grid = new char[n][n];
        int sx = -1, sy = -1, ex = -1, ey = -1;

        for (int i = 0; i < n; i++) {
            String line = scanner.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 'S') {
                    sx = i;
                    sy = j;
                } else if (grid[i][j] == 'E') {
                    ex = i;
                    ey = j;
                }
            }
        }

        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sx, sy, 0});
        dp[sx][sy] = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1], cost = curr[2];

            if (x == ex && y == ey) {
                System.out.println(cost);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && grid[nx][ny] != 'M' && dp[nx][ny] > cost + (grid[nx][ny] != 'T' ? 1 : 0)) {
                    dp[nx][ny] = cost + (grid[nx][ny] != 'T' ? 1 : 0);
                    queue.offer(new int[]{nx, ny, dp[nx][ny]});
                }
            }
        }

        System.out.println(-1); // No path found
    }
}