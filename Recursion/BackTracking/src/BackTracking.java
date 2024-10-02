public class BackTracking {

    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true,true},
                {true, true, true}
        };
        allPath("",maze,0,0);
    }
    static void allPath(String p,boolean[][] maze,int r,int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        //I am considering this block in my path
        maze[r][c]=false;

        if(r<maze.length-1){
            allPath(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPath(p+'R',maze,r,c+1);
        }
        if(r>0){
            allPath(p+"U",maze,r-1,c);
        }
        if(c>0){
            allPath(p+"L",maze,r,c-1);
        }
        //thia is the line where the function will be over
        //so before the function get remove ,also remove the changes that were made by that function
       maze[r][c]=true;
    }

}
//---------------code from Chatgpt -----------------------
//public class BackTracking {
//
//    public static void main(String[] args) {
//        boolean[][] maze = {
//                {true, true, true},
//                {true, false, true},
//                {true, true, true}
//        };
//        allPath("", maze, 0, 0);
//    }
//
//    static void allPath(String p, boolean[][] maze, int r, int c) {
//        // Base condition: If we reach the bottom-right corner
//        if (r == maze.length - 1 && c == maze[0].length - 1) {
//            System.out.println(p);
//            return;
//        }
//        // If the current cell is not walkable, return
//        if (!maze[r][c]) {
//            return;
//        }
//        // Mark the current cell as visited
//        maze[r][c] = false;
//
//        // Move down if within bounds
//        if (r < maze.length - 1) {
//            allPath(p + 'D', maze, r + 1, c);
//        }
//        // Move right if within bounds
//        if (c < maze[0].length - 1) {
//            allPath(p + 'R', maze, r, c + 1);
//        }
//        // Move up if within bounds
//        if (r > 0) {
//            allPath(p + 'U', maze, r - 1, c);
//        }
//        // Move left if within bounds
//        if (c > 0) {
//            allPath(p + 'L', maze, r, c - 1);
//        }
//        // Backtrack: Unmark the current cell as visited before returning
//        maze[r][c] = true;
//    }
//}
