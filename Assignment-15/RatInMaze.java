import java.util.*;

public class RatInMaze {
    public List<String> findPaths(int[][] maze, int n) {
        List<String> paths = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        if (maze[0][0] == 1)
            solve(0, 0, "", maze, visited, paths, n);
        return paths;
    }

    private void solve(int x, int y, String path, int[][] maze, boolean[][] visited, List<String> paths, int n) {
        if (x == n - 1 && y == n - 1) {
            paths.add(path);
            return;
        }

        visited[x][y] = true;

        if (x + 1 < n && maze[x + 1][y] == 1 && !visited[x + 1][y])
            solve(x + 1, y, path + "D", maze, visited, paths, n);

        if (y - 1 >= 0 && maze[x][y - 1] == 1 && !visited[x][y - 1])
            solve(x, y - 1, path + "L", maze, visited, paths, n);

        if (y + 1 < n && maze[x][y + 1] == 1 && !visited[x][y + 1])
            solve(x, y + 1, path + "R", maze, visited, paths, n);

        if (x - 1 >= 0 && maze[x - 1][y] == 1 && !visited[x - 1][y])
            solve(x - 1, y, path + "U", maze, visited, paths, n);

        visited[x][y] = false;
    }

    public static void main(String[] args) {
        RatInMaze rat = new RatInMaze();
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        List<String> paths = rat.findPaths(maze, 4);
        System.out.println(paths);
    }
}
