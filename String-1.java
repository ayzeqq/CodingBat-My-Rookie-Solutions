public class plusOut {

public String plusOut(String str, String word) {
  String result="";
  int a=word.length();

  for(int i=0;i<str.length();i++){
    if(str.substring(i,i+Math.min(a,(str.length()-i))).equals(word)){
      result=result+word;
      i=i+a;
    }
    result=result + "+";
  }
  return result;
}
}