package p4_MedianOfTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] total = new int[nums1.length + nums2.length];
        int a=0, b=0;
        for(int i=0; i<total.length; i++){
        	if(a==nums1.length){
                total[i] = nums2[b];
                b++;
        	}else if(b==nums2.length){
                total[i] = nums1[a];
                a++;
            }else if(b<nums2.length && nums1[a]>nums2[b]){
                total[i] = nums2[b];
                b++;
            }else{
            	total[i] = nums1[a];
            	a++;
            }
        }
        
        if(total.length==0){
            return 0;
        }else if(total.length%2==1){
            return (double)total[total.length/2];
        }else{
            return (double)(total[total.length/2] + total[total.length/2-1]) / 2;
        }
    }
}