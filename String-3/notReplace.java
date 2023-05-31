/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced
with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so
for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
*/

public String notReplace(String str) {
  char[] letters=str.toCharArray();
  String str2="";
  for(int i=0;i<letters.length;i++){
    if(str.equals("is")) return "is not";
    else if(str.charAt(i)=='i'){
      if((i==0 && str.charAt(i+1)=='s' && !Character.isLetter(str.charAt(i+2))) ||
      ((0<i && i+2<letters.length) && !Character.isLetter(str.charAt(i-1)) && str.charAt(i+1)=='s' && !Character.isLetter(str.charAt(i+2))) ||
      (i+2==letters.length && str.charAt(i+1)=='s' && !Character.isLetter(str.charAt(i-1)))){
        str2+="is not";
        i++;
      }
      else{
        str2+=str.charAt(i);
      }
    }
    else{
      str2+=str.charAt(i);
    }
  }
  return str2;
}
//https://academy.patika.dev/
