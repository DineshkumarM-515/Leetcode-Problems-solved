            }
        }
        for(int row=0;row<m;row++){
            Set<Integer> set2 = new HashSet<>();
            for(int col=0;col<m;col++){
                if(set2.contains(matrix[col][row])) return false;
                set1.add(matrix[row][col]);
                if(set1.contains(matrix[row][col])) return false;
            for(int col=0;col<m;col++){