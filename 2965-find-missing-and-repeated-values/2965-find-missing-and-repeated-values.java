class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int size=n*n;
        int[] frequency=new int[size+1];
        for(int value[]:grid){
            for(int num:value){
                frequency[num]++;

            }
        }
            
        int repeated=-1;
        int missing=-1;
        for(int num=1;num<=size;num++){
            if(frequency[num]==2){
                repeated=num;
            }else if(frequency[num]==0){
                missing=num;
            }
             if (repeated != -1 && missing != -1) {
                break;
            }
        }
        return new int[]{repeated,missing};
    }
}