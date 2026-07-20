# Last updated: 7/19/2026, 10:32:15 PM
1class Solution:
2    def cloneGraph(self, node):
3        if not node:
4            return None
5
6        visited = {}
7
8        def dfs(curr):
9            if curr in visited:
10                return visited[curr]
11
12            clone = Node(curr.val)
13            visited[curr] = clone
14
15            for neighbor in curr.neighbors:
16                clone.neighbors.append(dfs(neighbor))
17
18            return clone
19
20        return dfs(node)