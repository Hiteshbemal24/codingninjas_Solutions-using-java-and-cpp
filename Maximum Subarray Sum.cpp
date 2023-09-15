long long maxSubarraySum(vector<int> arr, int n)
{
    long long currSum=0,maxSum=0;
        int maxm=LONG_MIN;
        for(int i=0;i<n;i++){
            currSum +=arr[i];
            currSum = currSum>0?currSum:0;
            maxSum = max(maxSum,currSum);
            maxm = max(maxm,arr[i]);
        }
        if(maxSum==0){
            return maxm;
        }
        return maxSum;
}
