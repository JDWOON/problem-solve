package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    	List<Integer> p = new ArrayList<Integer>();
    	for(int i=0; i<nums1.length; i++){
    		for(int j=0; j<nums2.length; j++){
    			if(nums1[i]==nums2[j] && !p.contains(nums1[i])){
    				p.add(nums1[i]);
    			}
    		}
    	}
    	int[] ans = new int[p.size()]; 
    	for(int i=0; i<p.size(); i++){
    		ans[i]=p.get(i);
    	}
    	return ans;
    }
}