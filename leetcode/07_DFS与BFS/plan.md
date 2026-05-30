# 07 DFS与BFS

## 核心思路

DFS 和 BFS 是搜索/遍历的两大基本范式：

1. **DFS（深度优先）**：递归/栈实现，适用于路径搜索、连通性判断、回溯
2. **BFS（广度优先）**：队列实现，适用于最短路径、层序遍历

**网格DFS模板**（岛屿问题）：
```python
def dfs(grid, i, j):
    if i < 0 or i >= len(grid) or j < 0 or j >= len(grid[0]) or grid[i][j] != '1':
        return
    grid[i][j] = '0'
    dfs(grid, i+1, j)
    dfs(grid, i-1, j)
    dfs(grid, i, j+1)
    dfs(grid, i, j-1)
```

**BFS模板**（最短路径）：
```python
queue = deque([start])
visited = {start}
while queue:
    node = queue.popleft()
    for neighbor in get_neighbors(node):
        if neighbor not in visited:
            visited.add(neighbor)
            queue.append(neighbor)
```

## 推荐题目

### Day 18 - 网格DFS
| # | 题目 | 难度 | 核心考点 |
|---|------|------|----------|
| 200 | 岛屿数量 | Medium ⭐ | 网格DFS模板题 |
| 695 | 岛屿的最大面积 | Medium | DFS统计面积 |
| 130 | 被围绕的区域 | Medium ⭐ | 边界DFS标记 |

### Day 19 - 网格BFS
| # | 题目 | 难度 | 核心考点 |
|---|------|------|----------|
| 994 | 腐烂的橘子 | Medium | BFS多源最短路径 |
| 1091 | 二进制矩阵中的最短路径 | Medium | BFS最短路径 |
| 127 | 单词接龙 | Medium ⭐ | BFS建图搜索 |

### Day 20 - 综合搜索
| # | 题目 | 难度 | 核心考点 |
|---|------|------|----------|
| 417 | 太平洋大西洋水流问题 | Medium | 双向DFS/BFS |
| 207 | 课程表 | Medium ⭐ | 拓扑排序/BFS |
| 785 | 判断二分图 | Medium | BFS染色 |

### Day 21 - 进阶
| # | 题目 | 难度 | 核心考点 |
|---|------|------|----------|
| 547 | 省份数量 | Medium ⭐ | 并查集/DFS |
| 399 | 除法求值 | Medium | 图DFS/BFS |
| 210 | 课程表II | Medium | 拓扑排序输出顺序 |
