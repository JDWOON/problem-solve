class Solution(object):
    def intersect(self, nums1, nums2):
        p = []
        for i in nums1:
            for j in nums2:
                if i==j:
                    p.append(j)
                    nums2.remove(j)
                    break;
        return p