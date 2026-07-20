# Last updated: 7/19/2026, 10:37:07 PM
1class Solution:
2    def detectCycle(self, head):
3        slow = head
4        fast = head
5
6        # Step 1: Detect if a cycle exists
7        while fast and fast.next:
8            slow = slow.next
9            fast = fast.next.next
10
11            if slow == fast:
12                break
13        else:
14            return None
15
16        # Step 2: Find the start of the cycle
17        slow = head
18        while slow != fast:
19            slow = slow.next
20            fast = fast.next
21
22        return slow