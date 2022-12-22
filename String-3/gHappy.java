/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
immediately to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
*/

public boolean gHappy(String str) {
  if(str.length()<2 && str.contains("g")){
    return false;
  }
  for(int i=0;i<str.length();i++){
    if(str.substring(i).startsWith("g")){
      if(!str.substring(i+1).startsWith("g") && str.length()>i && i>0 && !str.substring(i-1).startsWith("g")){
        return false;
      }
    }
  }
  return true;
}
