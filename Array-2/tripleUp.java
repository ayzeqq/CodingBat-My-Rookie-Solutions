/*
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
*/

public boolean tripleUp(int[] nums) {
  int count=1;
  int temp=1;
  for(int i=1; i<nums.length; i++){
    if(nums[i]==nums[i-1]+1) count++;
    else{
      temp=Math.max(temp,count);
      count=1;
    }
  }
  if(Math.max(temp,count)>=3) return true;
  return false;
}
//https://academy.patika.dev
