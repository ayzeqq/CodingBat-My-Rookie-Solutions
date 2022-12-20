/*
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z'
and ending with 'p'. Return a string where for all such words, the middle letter is
gone, so "zipXzap" yields "zpXzp".


zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
*/

public String zipZap(String str) {
  if(str.length()<3){
    return str;
  }
  int count=0;
  int j=0;
  char[] letters=str.toCharArray();
  for(int i=1;i<letters.length-1;i++){
    if(letters[i-1]=='z' && letters[i+1]=='p'){
      count+=1;
    }
  }
  char[] ltr=new char[letters.length-count-2];
  for(int i=1;i<letters.length-1;i++){
    if(letters[i-1]=='z' && letters[i+1]=='p'){
      continue;
    }
  ltr[j]=letters[i];
  j=j+1;
  }
  return String.valueOf(letters[0])+String.valueOf(ltr)+String.valueOf(letters[str.length()-1]);
}
