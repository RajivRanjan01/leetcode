class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        
        HashSet<Character>[] col = new HashSet[9];
        
        HashSet<Character>[] box = new HashSet[9];

        for(int i = 0 ; i<9 ; i++){
            rows[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int r = 0 ; r < 9 ; r++){
            for(int c = 0 ; c < 9 ; c++){
                char currentVal = board[r][c];

                if(currentVal == '.') continue;

                int boxIdx = (r/3) * 3 + (c/3);

                if(!rows[r].add(currentVal)||!col[c].add(currentVal)||
                !box[boxIdx].  add(currentVal)){
                    return false;
                }
            }
        }
        return true;
    }
}