package Week1;
// Problem Link : https://www.interviewbit.com/problems/intersection-of-sorted-arrays/?study_plan=study-plan-3-months&/

public class Solution4 {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] intersect(final int[] A, final int[] B) {
        
        int i=0, j=0;
        int temp[] = new int[Math.min(A.length, B.length)];
        int k = 0;
        
        while(i<A.length && j<B.length){
            if(A[i] == B[j]){
                temp[k++] = A[i];
                i++;
                j++;
            }
            else if(A[i] < B[j]){
                i++;
            }
            else{
                j++;
            }
        }
        
        int result[] = new int[k];
        for(int m=0; m<k; m++){
            result[m] = temp[m];
        }
        
        return result;
    }
}
