class Solution {
    public int[] twoSum(int[] arr, int x) {
        int[] ans=new int[2];
        Boolean flag=false;  //optimization code
             for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==x){
                     ans[0]=i;
                     ans[1]=j;
                     flag=true;
                     break;
                    }
                }
                if(flag==true)break;
             }
             return ans;
    }
}