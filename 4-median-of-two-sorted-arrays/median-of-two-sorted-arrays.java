class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int p1= 0;
        int p2= 0;
        while(p1 < nums1.length && p2<nums2.length){
            if(nums1[p1] < nums2[p2]){
                list.add(nums1[p1]);
                p1++;
            } 
            else{
                list.add(nums2[p2]);
                p2++;
            }
        }

        while(p1 < nums1.length){
            list.add(nums1[p1++]);
        }
        while(p2 < nums2.length){
            list.add(nums2[p2++]);
        }

        int s = list.size();

        int median = s / 2;
        if(s%2 != 0){
            return list.get(median);
        }

        return ((double)(list.get(median-1) + list.get(median) ) )/ 2.0;
    }
}