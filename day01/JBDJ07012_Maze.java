
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JBDJ07012_Maze {
    
    static int[][] maze = {
        {0, 1, 0, 0, 0, 0, 1, 0, 0, 0},
        {0, 1, 0, 1, 1, 0, 1, 1, 0, 0},
        {0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
        {0, 1, 1, 0, 0, 1, 1, 0, 1, 0},
        {0, 0, 0, 1, 0, 0, 0, 0, 1, 0},
        {0, 1, 0, 0, 0, 1, 1, 0, 1, 0},
        {0, 1, 1, 1, 0, 1, 0, 0, 1, 0},
        {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
        {1, 1, 0, 0, 1, 1, 0, 1, 1, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };
    static boolean[][] visited = new boolean[10][10];
    static int pathCount;

    public static void main(String[] args) {
        if (searchForLoad(0, 0)) {
            System.out.println("Pass, " + pathCount);
        } else {
            System.out.println("Fail, " + pathCount);
        }
    }

    private static boolean searchForLoad(int idxX, int idxY) {
        
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{idxX, idxY});
        pathCount = 0;

        int[][] coordinates = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];

            if (x < 0 || y < 0 || x >= 10 || y >= 10|| maze[x][y] == 1 || visited[x][y]) {
                continue;
            }

            if (x == 9 && y == 9) {
                pathCount++;
                return true;
            }

            visited[x][y] = true;
            pathCount++;

            for (int[] coordinate : coordinates) {
                int newX = x + coordinate[0];
                int newY = y + coordinate[1];
                stack.push(new int[]{newX, newY});
            }
        }

        return false;
    }
}