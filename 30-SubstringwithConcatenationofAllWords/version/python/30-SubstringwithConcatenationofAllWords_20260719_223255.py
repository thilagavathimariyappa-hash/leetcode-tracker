# Last updated: 7/19/2026, 10:32:55 PM
1class Solution:
2    def copyRandomList(self, head):
3        if not head:
4            return None
5
6        old_to_new = {}
7
8        curr = head
9        while curr:
10            old_to_new[curr] = Node(curr.val)
11            curr = curr.next
12
13        curr = head
14        while curr:
15            if curr.next:
16                old_to_new[curr].next = old_to_new[curr.next]
17            if curr.random:
18                old_to_new[curr].random = old_to_new[curr.random]
19            curr = curr.next
20
21        return old_to_new[head]