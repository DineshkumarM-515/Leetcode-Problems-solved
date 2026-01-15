class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> li = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]) i++;
            else if(nums1[i] > nums2[j]) j++;
            else{
                li.add(nums1[i]);
                i++;
                j++;
            } 
        }

        int[] arr = new int[li.size()];
        for(int l=0;l<li.size();l++){
            arr[l] = li.get(l);
        }

        return arr;
    }
}