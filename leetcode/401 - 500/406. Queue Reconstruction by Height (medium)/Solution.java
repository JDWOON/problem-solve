package leetcode;

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
		int[][] p = new int[people.length][2];

		for (int i = 0; i < people.length; i++) {
			int min = Integer.MAX_VALUE;
			int pos=0;
			
			for(int j=0; j<people.length; j++){
				if(people[j][1]==0 && people[j][0] < min){
					pos = j;
					min = people[j][0];
				}
			}
			p[i][0] = people[pos][0];
			p[i][1] = 0;
			people[pos][0]=Integer.MAX_VALUE;
			
			for(int j=0; j<i; j++){
				if(p[j][0] >= p[i][0]){
					p[i][1]++;
				}
			}
			
			for(int j=0; j<people.length; j++){
				if(p[i][0] >= people[j][0]){
					people[j][1]--;
				}
			}
		}

		return p;
    }
}