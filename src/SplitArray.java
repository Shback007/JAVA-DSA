public class SplitArray {
    public static void main(String[] args) {
        int[]nums={7,2,5,8,10};
        int a=splitArray(nums,2);
        System.out.println(a);
    }
    static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);//int the end of loop it will contain max value
            end+=nums[i];
        }
        //binary search
        while(start<end){
            //try for the middle for the potential answer
            int mid=start+(end-start)/2;

            //caclulate how mane pieces you can divide this in with this max sum
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if(sum+num>mid) {
                    //you cannot add this in subarray,make new one
                    //say you add  this sum in new subarray,then sum=num
                    sum = num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }

            if(pieces>k){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;//end=start
    }
}
