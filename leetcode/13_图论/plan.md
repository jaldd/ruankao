# 13 图论

## 核心思路

图论核心算法：
1. **拓扑排序**：BFS入度法，判断有向图是否有环
2. **并查集**：合并集合+查询根节点，处理连通性问题
3. **最短路径**：Dijkstra（无负权）、Bellman-Ford（有负权）、Floyd（全源）
4. **最小生成树**：Kruskal（边排序+并查集）、Prim（点扩展）

**并查集模板**：
```python
parent = list(range(n))

def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]

def union(x, y):
    parent[find(x)] = find(y)
```

## 推荐题目

### Day 51 - 并查集
| # | 题目 | 难度 | 核心考点 |
|---|------|------|----------|
| 200 | 岛屿数量 | Medium | 复习，用并查集解 |
| 547 | 省份数量 | Medium ⭐ | 并查集模板 |
| 684 | 冗余连接 | Medium | 并查集找环 |
| 721 | 账户合并 | Medium | 并查集+哈希 |

### Day 52 - 拓扑排序
| # | 题目 | 难度 | 核心考点 |
|---|------|------|----------|
| 207 | 课程表 | Medium ⭐ | BFS入度法 |
| 210 | 课程表II | Medium | 拓扑排序输出顺序 |
| 329 | 矩阵中的最长递增路径 | Hard | 拓扑排序/记忆化DFS |

### Day 53-54 - 最短路径+综合
| # | 题目 | 难度 | 核心考点 |
|---|------|------|----------|
| 743 | 网络延迟时间 | Medium ⭐ | Dijkstra模板 |
| 787 | K站中转内最便宜的航班 | Medium | Bellman-Ford / DP |
| 1334 | 阈值距离内邻居最少的城市 | Medium | Floyd模板 |
| 1584 | 连接所有点的最小费用 | Medium | 最小生成树 |
