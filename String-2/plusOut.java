/*
Given a string and a non-empty word string, return a version of the original String where
all chars have been replaced by pluses ("+"), except for appearances of the word string
which are preserved unchanged.

plusOut("12xy34", "xy") → "++xy++"
plusOut("12xy34", "1") → "1+++++"
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
*/


public String plusOut(String str, String word) {
  String result="";
  int a=word.length();
  for(int i=0;i<str.length();i++){
    if(str.substring(i,i+Math.min(a,(str.length()-i))).equals(word)){
      result=result+word;
      i=i+a-1;
    }
    else{
      result=result + "+";
    }
  }
  return result;
}
