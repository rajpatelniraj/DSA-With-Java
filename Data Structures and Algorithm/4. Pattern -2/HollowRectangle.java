public class HollowRectangle {
    public static void hollow_rectangle(int totRows, int totCols) {
        // Outer loop
        for(int i =1; i<=totRows; i++){
            // inner-Columns
            for(int j =1; j<=totCols; j++){
                //Cell (i,j)
                if(i==1 || i== totRows || j==1 || j==totCols) {
                    // Boundary Cells
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Main Function
    public static void main(String args[]) {
        hollow_rectangle(4,5);
        
    }
}