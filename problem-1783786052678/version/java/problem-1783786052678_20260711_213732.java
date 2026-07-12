// Last updated: 7/11/2026, 9:37:32 PM
1import java.util.*;
2class Solution {
3    public int secondsBetweenTimes(String startTime, String endTime) {
4        int startSeconds = convertToSeconds(startTime);
5        int endSeconds = convertToSeconds(endTime);
6        int diff = endSeconds - startSeconds;
7        if(diff < 0){
8            diff += 24 * 3600;
9        }
10        return diff;
11    }
12    private int convertToSeconds(String timeStr){
13        String[] parts = timeStr.split(":");
14        int hours = Integer.parseInt(parts[0]);
15        int minutes = Integer.parseInt(parts[1]);
16        int seconds = Integer.parseInt(parts[2]);
17
18        return(hours * 3600)+(minutes*60)+seconds;
19    }
20}