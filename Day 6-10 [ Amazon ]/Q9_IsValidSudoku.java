class Q9_IsValidSudoku{
    static int isValid(int arr[][]){
        int n=9;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (!isValidConfig(arr, i, j))
                     return 0;
            }
        }
        return 1;
    }
    public static boolean isValidConfig(int arr[][], int row, int col){
        return notInRow(arr, row) && notInCol(arr, col) &&
           notInBox(arr, row - row % 3, col - col % 3);
    }
    public static boolean notInBox(int arr[][], int startRow, int startCol){
         HashSet<Integer> st = new HashSet<>();
 
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                 int curr = arr[row + startRow][col + startCol];
            if (st.contains(curr))
                return false;
            if (curr != 0)
                st.add(curr);
             }
         }
         return true;
    }
    public static boolean notInCol(int arr[][], int col){
        HashSet<Integer> st = new HashSet<>();
 
        for(int i = 0; i < 9; i++){
            if (st.contains(arr[i][col]))
                 return false;
        if (arr[i][col] != 0)
            st.add(arr[i][col]);
        }
        return true;
    }
    public static boolean notInRow(int arr[][], int row){
        HashSet<Integer> st = new HashSet<>();
 
        for(int i = 0; i < 9; i++){
        if (st.contains(arr[row][i]))
            return false;
 
        if (arr[row][i] != 0)
            st.add(arr[row][i]);
        }
        return true;
    }

}