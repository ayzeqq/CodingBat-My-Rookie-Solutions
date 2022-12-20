public class plusOut {

public String plusOut(String "123123", String "3") {
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
