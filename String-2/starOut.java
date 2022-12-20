public String starOut(String str) {
  if(!str.contains("*")){
    return str; //yıldız içermiyorsa değeri direkt döndürüyor
  }
  if(str.length()<3 & str.contains("*")){
    return ""; //3ten az karakter var ve yıldız var ise boş döndürüyor
  }
  char letters[]=str.toCharArray(); //girilen değeri array yapıyorum
  int j=0;
  for(int i=1;i<str.length()-1;i++){
    if(str.charAt(i)=='*' || str.charAt(i+1)=='*' || str.charAt(i-1)=='*'){
      continue;
    }
    j+=1; //j, yıldız yanında olmayan harf sayısına ulaşıyor(ilk/son harfler hariç)
  }
  if(str.endsWith("*")){ //yıldızın sonda olması durumu
    char ltr[]=new char[j+1];
    int k=1;
    for(int i=1;i<str.length()-1;i++){
     if(str.charAt(i)=='*' || str.charAt(i+1)=='*' || str.charAt(i-1)=='*'){
       continue;
     }
     ltr[k]=letters[i];
     k+=1;
    }
    ltr[0]=letters[0];
    return String.valueOf(ltr);
  }
  if(str.startsWith("*")){ //yıldızın başta olması durumu
    char ltr[]=new char[j+1];
    int k=0;
    for(int i=1;i<str.length()-1;i++){
     if(str.charAt(i)=='*' || str.charAt(i+1)=='*' || str.charAt(i-1)=='*'){
       continue;
     }
     ltr[k]=letters[i];
     k+=1;
    }
    ltr[j]=letters[str.length()-1];
    return String.valueOf(ltr);
  }
  if(str.charAt(1)!='*' && str.charAt(str.length()-1)!='*'){
  char ltr[]=new char[j+2]; //başında ve sonunda yıldız yoksa fazladan yer açmak için +2 ekliyoruz
  int k=1;
  for(int i=1;i<str.length()-1;i++){
    if(str.charAt(i)=='*' || str.charAt(i+1)=='*' || str.charAt(i-1)=='*'){
      continue;
    }
    ltr[k]=letters[i];
    k+=1;
  }
  ltr[0]=letters[0];
  ltr[j+1]=letters[str.length()-1];
  return String.valueOf(ltr);
  }
  if(str.charAt(1)=='*' && str.charAt(str.length()-2)=='*'){
  char ltr[]=new char[j];
  int k=1;
  for(int i=1;i<str.length()-1;i++){
    if(str.charAt(i)=='*' || str.charAt(i+1)=='*' || str.charAt(i-1)=='*'){
      continue;
    }
    ltr[k]=letters[i];
    k+=1;
  }
  return String.valueOf(ltr);
  }
  if(str.charAt(1)=='*' && str.charAt(str.length()-2)!='*'){
  char ltr[]=new char[j+1];
  int k=1;
  for(int i=1;i<str.length()-1;i++){
    if(str.charAt(i)=='*' || str.charAt(i+1)=='*' || str.charAt(i-1)=='*'){
      continue;
    }
    ltr[k]=letters[i];
    k+=1;
  }
  ltr[j]=letters[str.length()-1];
  return String.valueOf(ltr);
   }
  return str;
}
