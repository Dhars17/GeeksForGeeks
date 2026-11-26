class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        int left=0;
        int right=1;
        while(left<arr.length){
            int count=1;
            while(right<arr.length && arr[right]==arr[left]){
                count++;
                right++;
            }
            if(count > Math.floor(arr.length/3)){
                list.add(arr[left]);
            }
            left=right;
            right=left+1;
        }
        return list;
    }
}
