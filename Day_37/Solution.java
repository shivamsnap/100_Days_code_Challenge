class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        int ans=0;
        int sum=0;
        int maxSum=0;
        
        int start=0;
        
        int minLength = n+1;
        
        for(int i=0;i<n;i++){
            
            sum+=a[i];
            
            if(sum>x){  //is sum is greater then X then subtract sum
            
            while(sum>x){
                sum-=a[start++];
            }
            minLength = Math.min(minLength,i-start+2);
            
            } 
        }
        return minLength ==n+1?0:minLength;
    }
}