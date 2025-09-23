class Solution {
    public int compareVersion(String version1, String version2) {
        String[] revision1 = version1.split("\\.");
        String[] revision2 = version2.split("\\.");
        
        int i=0;
        while(i<revision1.length || i<revision2.length){
            int rev1 = (i<revision1.length) ? (Integer.parseInt(revision1[i])):0;
            int rev2 = (i<revision2.length) ? (Integer.parseInt(revision2[i])):0;

            if(rev1 < rev2) return -1;
            if(rev1 > rev2) return 1;
            i++;
        }
        return 0;
    }
}