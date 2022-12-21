public boolean equalIsNot(String str) {
  int count1=0;
  int count2=0;
  for(int i=0;i<str.length()-1;i++){
    if(str.substring(i,i+2).equals("is")){
      count1+=1;
    }
  }
  for(int i=0;i<str.length()-2;i++){
    if(str.substring(i,i+3).equals("not")){
      count2+=1;
    }
  }
  if(count1==count2){
    return true;
  }
  return false;
}
