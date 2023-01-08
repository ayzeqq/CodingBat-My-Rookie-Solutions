/*
Given a string, return the length of the largest "block" in the string.
A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
*/

public int maxBlock(String str) {
  if(str.length()<1){
    return 0;
  }
  int count=1, count1=1;
  for(int i=0;i<str.length();i++){
    for(int j=i;j<str.length()-1;j++){
      if(str.charAt(j)==str.charAt(j+1)){
        count+=1;
      }
      else{break;}
    }
    if(count>count1){
      count1=count;
    }
    count=1;
  }
  return count1;
}
