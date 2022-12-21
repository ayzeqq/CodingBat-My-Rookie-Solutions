/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say
that a y or z is at the end of a word if there is not an alphabetic letter immediately
following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
*/

public int countYZ(String str) {
  char[] letters=str.toCharArray();
  for(int i=0;i<str.length();i++){
    if(!Character.isLetter(letters[i])){
      letters[i]=' ';
    }
  }
  String[] words=String.valueOf(letters).split(" ");
  int count=0;
  for(int j=0;j<words.length;j++){
    if(words[j].endsWith("y") || words[j].endsWith("z") || words[j].endsWith("Y") || words[j].endsWith("Z")){
      count+=1;
    }
  }
  return count;
}
