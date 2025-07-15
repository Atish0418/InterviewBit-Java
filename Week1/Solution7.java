public class Solution7 {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        
        
         ArrayList<Integer> list = new ArrayList<>();
         
         Stack<Integer> st = new Stack<>();
         
         for(int i=0; i<A.size(); i++){
             
             while(!st.isEmpty() && st.peek() >= A.get(i)){
                 st.pop();
             }
             
            int val = st.isEmpty() ? -1 : st.peek();
            
            list.add(val);
             
            st.push(A.get(i));
             
         }
         
         return list;
    }
}
