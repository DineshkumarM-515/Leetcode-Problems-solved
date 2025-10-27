class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor == color) return image;
        int R = image.length;
        int C = image[0].length;
        image[sr][sc] = color;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr,sc});

        int[][] directions = {{1,0} , {-1,0} , {0,1},{0,-1}};
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            
            for(int[] dir : directions){
                int newR = r+dir[0];
                int newC = c+dir[1];
                if(newR >= 0 && newR < R && newC >= 0 && newC < C){
                    if(image[newR][newC] == originalColor){
                        image[newR][newC] = color;
                        queue.add(new int[]{newR,newC});
                    }
                }
            }

        }

        return image;

    }
}