package neko.algorithm;


//给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
//
// 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
//
// 此外，你可以假设该网格的四条边均被水包围。
//
//
//
// 示例 1：
//
//
//输入：grid = [
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]
//输出：1
//
//
// 示例 2：
//
//
//输入：grid = [
//  ["1","1","0","0","0"],
//  ["1","1","0","0","0"],
//  ["0","0","1","0","0"],
//  ["0","0","0","1","1"]
//]
//输出：3
//
//
//
//
// 提示：
//
//
// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 300
// grid[i][j] 的值为 '0' 或 '1'
//
// Related Topics 深度优先搜索 广度优先搜索 并查集
// 👍 1131 👎 0


public class Leetcode200 {

  public static void main(String[] args) {
    Leetcode200 leetcode200 = new Leetcode200();
    int i = leetcode200.numIslands(new char[][]{
        {'1', '1', '1', '1', '0'},
        {'1', '1', '0', '1', '0'},
        {'1', '1', '0', '0', '0'},
        {'0', '0', '0', '0', '0'},
    });
    System.out.println(i);
  }

  public int numIslands(char[][] grid) {
    int count = 0;
    int n = grid.length;
    if (n == 0) {
      return 0;
    }
    int m = grid[0].length;
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < m; ++j) {
        if (grid[i][j] == '1') {
          dfs(grid, n, m, i, j);
          count++;
        }
      }
    }
    return count;
  }

  private void dfs(char[][] grid, int n, int m, int i, int j) {
    if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] != '1') {
      return;
    }
    grid[i][j] = '0';
    dfs(grid, n, m, i + 1, j);
    dfs(grid, n, m, i - 1, j);
    dfs(grid, n, m, i, j + 1);
    dfs(grid, n, m, i, j - 1);
  }


}
