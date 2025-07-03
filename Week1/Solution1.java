

// Problem Link: Majority Element: https://www.interviewbit.com/problems/majority-element/?study_plan=study-plan-3-months&/

import java.util.HashMap;

public class Solution1 {
    public int majorityElement(final int[] A) {
        int n = A.length;
        
        // optimal approach  (Moore's Voting Algorithm)
        int freq = 0;
        int ans = 0;
        
        for(int i=0; i<n; i++){
            if(freq == 0){
                ans = A[i];
            }
            
            if(ans == A[i]){
                freq++;
            }
            else{
               freq--; 
            }
        }
        
        return ans;
        
        
        // Better approach
        // HashMap<Integer, Integer> map = new HashMap<>();
        //  for (int num : A) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }

        // for (int key : map.keySet()) {
        //     if (map.get(key) > n / 2) {
        //         return key;
        //     }
        // }

        
        // Brute Force approach
        // for(int i=0; i<n; i++){
        //     int count = 0; 
        //     for(int j=0; j<n; j++){
        //         if(A[j] == A[i]){
        //             count++;
        //         }
                
        //         if(count > n/2){
        //             return A[i];
        //         }
        //     }
        // }

        // return -1;
    }
}
