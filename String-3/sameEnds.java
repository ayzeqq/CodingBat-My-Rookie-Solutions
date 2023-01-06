/*
Given a string, return the longest substring that appears at both the beginning and
end of the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
*/

public String sameEnds(String string) {
  int a=string.length()/2;
  for(int i=a;i>0;i--){
    if(string.substring(0,i).equals(string.substring(string.length()-i,string.length())))
    return string.substring(0,i);
  }
  return "";
}
