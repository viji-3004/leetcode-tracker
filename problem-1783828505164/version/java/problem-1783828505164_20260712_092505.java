// Last updated: 12/07/2026, 09:25:05
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        String[] start = startTime.split(":");
4        String[] end = endTime.split(":");
5
6        int startSeconds = Integer.parseInt(start[0])* 3600 +     
7        Integer.parseInt(start[1])*60  +Integer.parseInt(start[2]);
8
9        int endSeconds = Integer.parseInt(end[0])* 3600 + Integer.parseInt(end[1])*60 + Integer.parseInt(end[2]);    
10
11        return endSeconds- startSeconds;
12    }
13}