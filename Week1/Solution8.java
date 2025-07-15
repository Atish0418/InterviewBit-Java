public class Solution8 {
    public int solve(ArrayList<Integer> A, int B) {
        
        int n = A.size();
        
        int low = 0, high = n-1;
        
        int ans = -1;
        
        while(low <= high){
            
            int mid = low + (high - low) / 2;
            
            if(A.get(mid) <= B){
                
                ans = mid;
                
                low = mid + 1;
            }
            else{
                
                high = mid-1;
                
            }
        }
        
        return ans + 1;
    }
}