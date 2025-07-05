package Week1;
// Problem Link : https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/?study_plan=study-plan-3-months&/
public class Solution3 {
    public int[] getRow(int A) {
        
        int[] row = new int[A + 1];
        long ans = 1;
        row[0] = 1; 

        for (int col = 1; col <= A; col++) {
            ans = ans * (A - col + 1);
            ans = ans / col;
            row[col] = (int) ans;
        }
        
        return row;
    }
}

