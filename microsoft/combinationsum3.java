package microsoft;

class Solution {
     
    private void com(List<List<Integer>> ans,List<Integer> comb,
    int k,int index,int n){
        if(comb.size()==k&&n==0){
            List<Integer> li=new ArrayList<Integer>(comb);
            ans.add(li);
            return;
        }
        for(int i=index;i<=9;i++){
            comb.add(i);
            com(ans,comb,k,i+1,n-i);
            comb.remove(comb.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<> ();
        com(ans,new ArrayList<Integer>(),k,1,n);
        return ans;
    }
   
}