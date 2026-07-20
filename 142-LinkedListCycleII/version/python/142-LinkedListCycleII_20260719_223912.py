# Last updated: 7/19/2026, 10:39:12 PM
1class Node:
2    def __init__(self, key=0, value=0):
3        self.key = key
4        self.value = value
5        self.prev = None
6        self.next = None
7
8
9class LRUCache:
10
11    def __init__(self, capacity):
12        self.capacity = capacity
13        self.cache = {}
14
15        self.left = Node()
16        self.right = Node()
17
18        self.left.next = self.right
19        self.right.prev = self.left
20
21    def remove(self, node):
22        prev = node.prev
23        nxt = node.next
24        prev.next = nxt
25        nxt.prev = prev
26
27    def insert(self, node):
28        prev = self.right.prev
29        nxt = self.right
30
31        prev.next = node
32        node.prev = prev
33        node.next = nxt
34        nxt.prev = node
35
36    def get(self, key):
37        if key not in self.cache:
38            return -1
39
40        node = self.cache[key]
41        self.remove(node)
42        self.insert(node)
43        return node.value
44
45    def put(self, key, value):
46        if key in self.cache:
47            self.remove(self.cache[key])
48
49        node = Node(key, value)
50        self.cache[key] = node
51        self.insert(node)
52
53        if len(self.cache) > self.capacity:
54            lru = self.left.next
55            self.remove(lru)
56            del self.cache[lru.key]